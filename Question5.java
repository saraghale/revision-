//write a java program that takes two number as input and display like product of two numbers.
import java.util.Scanner;
class Question5{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        int product = num1*num2;
        System.out.println("The product is:"+ product);
    }

}