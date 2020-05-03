package java_comp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;

abstract class NaturalOrderComparator implements Comparator<Object> {

}

class NaturalOrderComparableGroup implements Comparable<NaturalOrderComparableGroup> {
    private final List<NaturalOrderComparableElement> elements;

    NaturalOrderComparableGroup(String string) {
        List<NaturalOrderComparableElement> elements = new ArrayList<>();
        int iIndex = 0;
        while (string.length() > iIndex) {
            Character character = string.charAt(iIndex);
            if (isAlphabetic(character)) {
                elements.add(new AlphabeticComparableElement(character));
                iIndex++;
            } else if (isDigit(character)) {
                NumericComparableElement numericComparableElement = new NumericComparableElement(character);
                iIndex++;
                while (string.length() >= iIndex + 1 && isDigit(string.charAt(iIndex))) {
                    numericComparableElement.add(string.charAt(iIndex));
                    iIndex++;
                }
                elements.add(numericComparableElement);
            } else {
                elements.add(new NonAlphanumericComparableElement(character));
                iIndex++;
            }
        }
        this.elements = elements;
    }

    public int compareTo(NaturalOrderComparableGroup o) {
        int iIndex = 0;
        while (!anyOfTheGroupsDoesntHaveEnoughElements(o, iIndex)) {
            if (elements.get(iIndex).compareTo(o.elements.get(iIndex)) != 0) {
                return elements.get(iIndex).compareTo(o.elements.get(iIndex));
            }
            iIndex++;
        }
        return shortest(o);
    }

    private boolean anyOfTheGroupsDoesntHaveEnoughElements(NaturalOrderComparableGroup o, int i) {
        return elements.size() < i + 1 || o.elements.size() < i + 1;
    }

    private int shortest(NaturalOrderComparableGroup o) {
        return Integer.compare(elements.size(), o.elements.size());
    }
}

interface NaturalOrderComparableElement<T extends NaturalOrderComparableElement> extends Comparable<NaturalOrderComparableElement> {
    Integer getPriority();

    @Override
    @SuppressWarnings("unchecked")
    default int compareTo(NaturalOrderComparableElement other) {
        int typeComparisonResult = this.getPriority().compareTo(other.getPriority());
        if (typeComparisonResult != 0) {
            return typeComparisonResult;
        } else {
            return compareToInstanceOfSameType((T) other);
        }
    }

    int compareToInstanceOfSameType(T other);
}

class AlphabeticComparableElement implements NaturalOrderComparableElement<AlphabeticComparableElement> {
    private static final Integer PRIORITY = 3;
    private final Character character;

    AlphabeticComparableElement(Character character) {
        this.character = character;
    }

    @Override
    public Integer getPriority() {
        return PRIORITY;
    }

    @Override
    public int compareToInstanceOfSameType(AlphabeticComparableElement other) {
        //Collator instance = Collator.getInstance(Locale.ITALY);
        return this.character.toString().toUpperCase().compareTo(other.character.toString().toUpperCase());
    }
}

class NumericComparableElement implements NaturalOrderComparableElement<NumericComparableElement> {
    private static final Integer PRIORITY = 2;
    private Integer integer;

    NumericComparableElement(Character character) {
        this.integer = Integer.valueOf(character.toString());
    }

    @Override
    public Integer getPriority() {
        return PRIORITY;
    }

    @Override
    public int compareToInstanceOfSameType(NumericComparableElement other) {
        return this.integer.compareTo(other.integer);
    }

    void add(char c) {
        this.integer = this.integer * 10 + new Integer(String.valueOf(c));
    }
}

class NonAlphanumericComparableElement implements NaturalOrderComparableElement<NonAlphanumericComparableElement> {
    private static final Integer PRIORITY = 1;
    private final Character character;

    NonAlphanumericComparableElement(Character character) {
        this.character = character;
    }

    @Override
    public Integer getPriority() {
        return PRIORITY;
    }

    @Override
    public int compareToInstanceOfSameType(NonAlphanumericComparableElement other) {
        return this.character.compareTo(other.character);
    }
}
