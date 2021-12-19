package Complexity;

public class StringMethods {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("Abc");

        System.out.println("Does s1 & s2 refer the same string? "+(s1 == s2));

        // .equals(), .equalsIgnoreCase() -> for string comparison
        System.out.println("Is s1 & s2 are same? "+s1.equals(s2));
        System.out.println("Is s1 & s3 are same? "+s1.equalsIgnoreCase(s3));
        System.out.println("--------------------------------------------");

        // .length() -> length of the string
        System.out.println("Length of the string s1 is : "+s1.length());
        System.out.println("--------------------------------------------");

        // .charAt(index i) -> returns character at index i[0 based index]
        System.out.println("0th Character of the string s1 is : "+ s1.charAt(0));
        System.out.println("--------------------------------------------");

        // .toUpperCase(), .toLowerCase() -> convert the string to upper case/lower case letters respectively
        System.out.println("The upper case conversion of s1 : "+s1.toUpperCase());
        System.out.println("The lower case conversion of s3 : "+s3.toLowerCase());
        System.out.println("--------------------------------------------");

        // .indexOf(), .lastIndexOf() -> index of a string/character inside another string
        System.out.println("Index of bc in s1 : "+s1.indexOf("bc"));
        System.out.println("Index of a in s1 : "+s1.indexOf('a'));
        System.out.println("--------------------------------------------");

        // .concat() -> For string concatenation
        System.out.println("Concatenation of s1 & s3 : "+s1.concat(s3));
        System.out.println("--------------------------------------------");

        // .subString(index) -> take substring from beginning index to last index(optional)
        System.out.println("Substring from 1 : " + s1.substring(1));
        System.out.println("Substring from 0 excluding 2 : " + s1.substring(0, 2)); // l to r-1
        System.out.println("--------------------------------------------");

        //.replace("oldStr", "newStr"), .replaceAll("oldStr", "newStr") -> replace character with another character or string with another string
        System.out.println("replacing 'a' with 'x' in s1 : "+s1.replace('a', 'x'));
        System.out.println("replacing \"a\" with \"xy\" in s1 : "+s1.replace("a", "xy"));
        System.out.println("--------------------------------------------");

        // .compareTo(s2), .compareToIgnoreCase(s2) -> compare in the lexicographic order
        System.out.println("Comparing \"cbc\" with "+s1+" : "+ "cbc".compareTo(s1));
        System.out.println("Comparing \"acc\" with "+s1+" : "+ "acc".compareTo(s1));
        System.out.println("Comparing \"acd\" with "+s1+" : "+ "acd".compareTo(s1));
        System.out.println("Comparing "+s1+" with "+s3+" : "+ s1.compareTo(s3));
        System.out.println("Comparing "+s1+" with "+s3+" : "+ s1.compareToIgnoreCase(s3));
        System.out.println("--------------------------------------------");

        // .contains(str2) -> check wheterh the given input string is substring or not
        System.out.println("Does "+s1+" contains \"ab\" ? "+ s1.contains("ab"));
        System.out.println("--------------------------------------------");

        //.trim() -> removes extra spaces from left & right
        System.out.println(" Trimming \"   Abc  \" : |"+"   Abc  ".trim()+"|");
        System.out.println(" Trimming \"   Abc  \" : |"+"   Abc  ".replace(" ","")+"|");
        System.out.println(" Trimming \"   Abc  \" : |"+"   Abc  ".replaceAll(" ","")+"|");
        System.out.println("--------------------------------------------");

        // .split(delimiter) -> split the string based on a delimiter
        System.out.println("Splitting \"a,b,c,d\" by comma : ");
        String[] sar = "a,b,c,d".split(",");
        for (String s: sar) {
            System.out.println(s);
        }
        // .join() -> printing array as a string with given delimiter
        System.out.println("Joining sar array : "+ String.join("|", sar));



    }
}
