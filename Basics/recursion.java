package Basics;

import java.lang.reflect.Method;

public class recursion {
    
    public static void main(String[] args) {
        sayhi(5);
    }

    public static void sayhi(int n) {
        if(n==0){
            System.out.println("Done !!");
        }else{
            System.out.println("hi");
            n--;

            sayhi(n);
        
        }
        
    }
}
