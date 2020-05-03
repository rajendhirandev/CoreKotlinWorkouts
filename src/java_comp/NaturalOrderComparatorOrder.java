package java_comp;

import java.util.Comparator;

public class NaturalOrderComparatorOrder implements Comparator<String> {
    public int compare(String o1, String o2) {
        NaturalOrderComparableGroup o1Comparable = new NaturalOrderComparableGroup(o1);
        NaturalOrderComparableGroup o2Comparable = new NaturalOrderComparableGroup(o2);
        return o1Comparable.compareTo(o2Comparable);
    }
}