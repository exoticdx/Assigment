package Assigment_1;
//21CE076-Dakhs Munagalpara
import java.util.Scanner;

public class Prac_7 {
    public static void main(String[] args) {
        int n = 8;
        int k=0;
        int m=0;
        for (int i=1;i<=8;i++){
            for (int j=1;j<=8-i;j++)
            {
                System.out.print("   ");
            }
            for (int j=1;j<=i;j++){
                k=(int)Math.pow(2,(j-1));
                System.out.print(String.format("% 3d",k));
            }
            for (int j=i;j>1;j--){
                m=(int)Math.pow(2,(j-2));
                System.out.print(String.format("% 3d",m));
            }
            System.out.println("");
        }
    }
}
