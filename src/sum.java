import java.util.Scanner;
public class sum {
    public static void main (String[] args) {
        System.out.print("Sum of number: ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second  number: ");
        int num2 = sc.nextInt();
        System.out.print(" Enter Third number: ");
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;
        System.out.println(sum);
    }
}