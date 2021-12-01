import java.util.Locale;

public class Strings {

    public static void main(String[] args){
        String a = "upgrad";
        String b = null;
        String c = "upgrad";
        String d = "Upgrad";
        c = "Upgraded";
        float num = 10.24567f;
        String numString = "" + num;

        StringBuffer sb = new StringBuffer("upgrad");
        sb.append("e");
        sb.append("d");

        System.out.println(sb);

        float i = Float.parseFloat("11.00000");

        System.out.println(i);
        System.out.println(numString);
    }
}
