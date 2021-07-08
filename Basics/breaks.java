package Basics;

public class breaks {
    public static void main(String[] args) {
        System.out.println("Break statements");

        int[] numbers = { 10, 20, 30, 20, 50 };

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 30){
                System.out.println(i);
                break;
            }

            //System.out.println(numbers[i]);
        }
    }
}
