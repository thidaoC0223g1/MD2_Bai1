import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        System.out.println("giai phuong trinh bac nhat");
        System.out.println("a*x + b = c");

        float a;
        float b;
        float c;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so a");
        a = input.nextFloat();

        System.out.println("nhap vao so b");
        b = input.nextFloat();

        System.out.println("nhap vao so c");
        c = input.nextFloat();

        if(a==0){
            if(b==c){
                System.out.println("phuong trinh vo so nghiem");
            }else{
                System.out.println("phuong trinh vo nghiem");
            }
        }else{
            float answer = (c-b)/a;
            System.out.println("x =" + answer);
        }


    }
}

