import java.util.Scanner;
public class largest_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a is the largest number");
        }
         else if (b>a){
        System.out.println("b is the largest number");
        }
        else
        {
            System.out.println("both are equal");
        }
    }
    
}
