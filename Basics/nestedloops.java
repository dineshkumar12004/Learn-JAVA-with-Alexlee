package Basics;

public class nestedloops {
    public static void main(String[] args) {

        System.out.println("nested loops dumbass !@!");

        String[][] fancycolors = { { "red", "blue" }, { "cyan", "magenta", "purple" } };
        for (int i=0; i<1;i++){
            for(int j=0;j<2;j++){
                System.out.println(fancycolors[i+1][j]);
            }
           
        }

        System.out.println("-------------------------");

        for(int i =0; i<2;i++){
            for(int j=0; j<5; j++){
                System.out.println("i: " + i + ",j: "+ j);
            }
        }
    }
}
