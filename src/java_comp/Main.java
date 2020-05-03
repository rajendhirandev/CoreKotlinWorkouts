package java_comp;

import ObjectClass.MyObjClass;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> inputArray = new ArrayList<String>() {
            {
                /*add("1.1");
                add("1.2");
                add("1a");
                add("10");
                add("1A");
                add("2B");
                add("2.1");*/

               /* add("1 topic");
                add("1.1");
                add("1.2");
                add("zebra");
                add("2.1");
                add("1A");
                add("1topic");
                add("10");
                add("2B");
                add("12B");
                add("Zebra");*/

                /*add("Abc");
                add("ABC");
                add("Äbc");
                add("äbc");
                add("Àbc");
                add("àbc");
                add("abc");*/

                /*add("Unit 1");
                add("Unit 10");
                add("Unit 2");
                add("Unit 11A");
                add("Unit 1.1.1");
                add("Unit 1A");
                add("Unit 1a");
                add("Unit 1B");
                add("Unit 1b");*/

               /* add("1 topic");
                add("10 topic");
                add("android");
                add("bat");
                add("Android");
                add("america");
                add("zeebra");
                add("America");
                add("Zeebra");
                add("Bat");
                add("2 topic");*/

            /* add("Unit 1");
                add("Unit 21");
                add("Unit 22");
                add("Unit 2");
                add("Unit 6");
                add("Unit 4");
                add("unit 4");*/

               /* add("abc");
                add("ABC");
                add("Zebra");
                add("zebra");
                add("Äbc");
                add("äbc");
                add("Abc");
                add("1.2");
                add("Àbc");
                add("àbc");
                add("2");
                add("10");
                add("2.2");
                add("1");
                add("1 Topic");
                add("1Topic");
                add("Ball");*/

               /*add("abc");
                add("ABC");
                add("Zebra");
                add("zebra");
                add("Abc");
                add("1.2");
                add("2");
                add("10");
                add("2.2");
                add("1");
                add("1 Topic");
                add("1Topic");
                add("Ball");*/

              /* add("ABC");
                add("abc");
                add("Abc");
                add("1");
                add("ABC 1");
                add("Abc 1.1.1");
                add("Unit 1");
                add("Unit 10");
                add("Unit 2");
                add("Unit 9");*/

                /*add("aradhana");
                add("Aradhana");*/

                add("1.1");
                add("1.2");
                add("10");
                add("1A");
                add("2B");
                add("2.1");
                add("1 Topic");
                add("1Topic");
                add("Zeebra");
                add("zeebra");
                add("12B");

            }
        };

        MyObjClass myObjClass   = new MyObjClass("teste",12);
        myObjClass.getUserId();

       /* List<PLAsset> plAssets = new ArrayList<PLAsset>() {
            {
                add(new PLAsset(1, "Unit 1"));
                add(new PLAsset(2, "Unit 10"));
                add(new PLAsset(3, "Unit 1.1"));
                add(new PLAsset(4, "Unit 2"));
            }
        };*/

        /*plAssets.sort(new NaturalOrderComparator() {
            @Override
            public int compare(Object o, Object t1) {
                PLAsset asset1 = (PLAsset) o;
                PLAsset asset2 = (PLAsset) t1;
                NaturalOrderComparableGroup o1Comparable = new NaturalOrderComparableGroup(asset1.name);
                NaturalOrderComparableGroup o2Comparable = new NaturalOrderComparableGroup(asset2.name);
                return o1Comparable.compareTo(o2Comparable);
            }
        });*/
        //inputArray.sort(Comparator.naturalOrder());
        /*Collator collator = Collator.getInstance();
        collator.setStrength(Collator.PRIMARY);
        inputArray.sort(collator);
        inputArray.sort(new AlphanumericSorting());*/
        //Collections.sort(inputArray, Collator.getInstance());
        //Collections.sort(inputArray, Collator.getInstance());
        //inputArray.sort(new AlphanumericSorting());
        //inputArray.sort(Comparator.naturalOrder());
        //System.out.println("Collator Output");
        //printCollection(inputArray);
        //new AlphanumericSorting().compare("Rag", "Ravi");
        //inputArray.sort(new IgnoreCaseComp());
        //inputArray.sort(new IgnoreCaseComp());
        //inputArray.sort(Comparator.reverseOrder());

      /* Collections.sort(inputArray, new Comparator<String>() {
            @Override
            public int compare(String t1, String t2) {
                String str1 = t1;
                String str2 = t2;
                int x = str1.compareTo(str2);
                if (x != 0)
                    x *= -1;
                return x;
            }
        });
        Collections.sort(inputArray, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return new AlphanumericSorting().compare(s, t1);
            }
        });*/

        //Collections.sort(inputArray, Comparator.naturalOrder());

        //inputArray.sort(Comparator.naturalOrder());
       /* Collator collator = Collator.getInstance();
        collator.setStrength(Collator.PRIMARY);
        inputArray.sort(collator);*/

        //inputArray.sort(new AlphanumericSorting());
       /* Collections.sort(inputArray, new NaturalOrderComparator() {
            @Override
            public int compare(Object o, Object t1) {
                NaturalOrderComparableGroup o1Comparable = new NaturalOrderComparableGroup(o.toString());
                NaturalOrderComparableGroup o2Comparable = new NaturalOrderComparableGroup(t1.toString());
                return o1Comparable.compareTo(o2Comparable);
            }
        });
*/
       /* System.out.println("Final Output");
        printCollection(inputArray);*/
       /* System.out.println("JSONValue: " + DataObject.getJson());
        System.out.println("Static Name: " + MyObjClass.getMyName());
        System.out.println("Static City: " + MyObjClass.Companion.getMyCity());*/

        /*List<Integer> dataList = Arrays.asList(1, 2, 4, 3, 7, 6, 5, 8, 10, 9);

        Long c = dataList.stream().filter(e -> e % 2 == 0).map(e -> e * 20).count();*/
        //System.out.println(c);

        /*String x="true";
        boolean j=Boolean.parseBoolean(x);
        System.out.println(j);*/

    }

    private static void printCollection(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    static class IgnoreCaseComp implements Comparator<String> {
        Collator col;

        IgnoreCaseComp() {
            col = Collator.getInstance();
        }

        public int compare(String strA, String strB) {
            return col.compare(strA, strB);
        }
    }
}
