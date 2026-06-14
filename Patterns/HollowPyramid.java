package Patterns;

public class HollowPyramid {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // stars and inner spaces
            for (int j = 1; j <= 2 * i - 1; j++) {

                if (i == 5 || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}