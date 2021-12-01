public class HandsOn3 {
    /*
    Write a program that decides whether a person is diabetic or not depending on their sugar level as per the following ranges:
    1. If less than 100 and fasting - normal
    2. If less than 130 before a meal  - normal
    3. If less than 180 after taking a meal - normal
    4. If none of the above - diabetic

     */

    public static void main(String[] args) {
        int sugarLevel = 105;
        String state = "fasting";

        System.out.println(state.equals("fasting"));
    }
}
