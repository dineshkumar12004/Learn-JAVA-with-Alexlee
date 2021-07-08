package Basics;

public class twodimarray {
    public static void main(String[] args) {
        System.out.println("2D ARRAY IN JAVA");

        int [][] lottery = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        System.out.println(lottery[0][2]); 
        
        System.out.println("-----------------------");
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(lottery[i][j]);
            }
            
        }
    }
}
