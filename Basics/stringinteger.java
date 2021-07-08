package Basics;
public class stringinteger {
    public static void main(String[] args) {
        System.out.println("String to integer !!");

        String s = "101";

        int n = Integer.parseInt(s);
        System.out.println(n+4);

        System.out.println("Vice versa ----------------");
        int num = 100;
        System.out.println(Integer.toString(num)+1);

        String age = "age : 47";
        age = age.replaceAll("\\D+", "");
        System.out.println(age);
    }
}
