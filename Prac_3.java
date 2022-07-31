package Assigment_1;
//21CE076-Dakhs Mungalpara
import java.util.Scanner;

public class Prac_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a%10;
        b = b%10;
        boolean c = a==b;
        System.out.println(c);
    }
}
