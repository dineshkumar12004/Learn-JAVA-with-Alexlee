package Basics;

public class returnstatements {
    public static void main(String[] args) {
        message();
        int sum = addto(1, 2);
        System.out.println(sum);
        String shouting = caps("why are you shouting ?!");

        System.out.println(shouting);
    }
    public static void message() {
        
        System.out.println("Our first commit");
    }

    public static int addto(int a, int b) {
        return (a+b);
    }

    public static String caps(String s) {
        return s.toUpperCase();
    }
}
