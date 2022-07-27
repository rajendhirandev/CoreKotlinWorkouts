package java_comp;
/*


import java.util.LinkedHashMap;
import java.util.Map;

public class DecimaltoRoman {
    public static String RomanNumerals(int num) {
        LinkedHashMap<String, Integer> romanNumerals = new LinkedHashMap<String, Integer>();
//storing roman letters and corresponding decimal values in HashMap  
        romanNumerals.put("M", 1000);
        romanNumerals.put("CM", 900);
        romanNumerals.put("D", 500);
        romanNumerals.put("CD", 400);
        romanNumerals.put("C", 100);
        romanNumerals.put("XC", 90);
        romanNumerals.put("L", 50);
        romanNumerals.put("XL", 40);
        romanNumerals.put("X", 10);
        romanNumerals.put("IX", 9);
        romanNumerals.put("V", 5);
        romanNumerals.put("IV", 4);
        romanNumerals.put("I", 1);
//variable for string the result  
        String result = "";
//loop iterate over Map  
        for (Map.Entry<String, Integer> entry : romanNumerals.entrySet()) {
            int matches = num / entry.getValue();
            result = result + repeat(entry.getKey(), matches);
            num = num % entry.getValue();
        }
        return result;
    }

    public static String repeat(String s, int n) {
        if (s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
//converts into string  
        return sb.toString();
    }

    //driver code
    public static void main(String args[]) {
//prints roman numerals from 1 to 200  
        for (int i = 3950; i < 4000 ; i++) {
            System.out.println("i=" + i + " -> " + RomanNumerals(i));
        }
    }
}  */


public class DecimaltoRoman {
    //method to convert integer to roman
//function that converts integer to roman
    String[] thousands = {"", "M", "MM", "MMM"};
    String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    //String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] tens = {"", "X", "XX", "XXX", "XL", "L"};
    String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    public String intToRoman(int number) {
//creating array of place values

        //return thousands[number / 1000] + hundreds[(number % 1000) / 100] + tens[(number % 100) / 10] + units[number % 10];
        return tens[(number % 100) / 10] + units[number % 10];
    }

    public static void main(String args[]) {
//creating an array of integers to be convert into roman
        int[] numbers = {13, 21, 38, 50, 190, 141, 117, 120, 125, 138, 149, 6, 712, 181, 197, 918, 199, 1100, 1101, 1248, 1253};
        for (int number : numbers) {
            if(number<51) {
                System.out.printf("%4d -> %8s\n", number, new DecimaltoRoman().intToRoman(number));
            }else{
                System.out.printf("%4d -> %8s\n", number, "Above 50");
            }
        }
    }
}
