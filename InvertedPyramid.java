package Patterns;

public class InvertedPyramid {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int k=2;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=7;j>=2*i-1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
