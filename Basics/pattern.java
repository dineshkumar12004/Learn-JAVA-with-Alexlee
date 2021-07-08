package Basics;

public class pattern {

    public static void innerPattern(int n)
    {   
        // Pattern Size
        int size = 2 * n - 1; 
        int front = 0;
        int back = size - 1;
        int a[][] = new int[size][size];
        while (n != 0) {
            for (int i = front; i <= back; i++) {
                for (int j = front; j <= back;
                                        j++) {
                    if (i == front || i == back ||
                         j == front || j == back)
                        a[i][j] = n;
                }
            }
            ++front;
            --back;
            --n;
        }
        print(a, size);
    }
  
    // function to Print pattern
    public static void print(int a[][], int size)
    {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
  
    // Main Method
    public static void main(String[] args)
    {
        int n = 2; // Input
        innerPattern(n);
    }
}
