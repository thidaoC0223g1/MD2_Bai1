import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so nam");
        int year = input.nextInt();

        if(year%4==0 && year%100!=0){
            System.out.println("Nam nhuan");
        }else if(year%100==0&&year%400!=0){
            System.out.println("Khong phai nam nhuan");
        }else if(year%100==0&&year%400==0){
            System.out.println("Nam nhuan");
        }else {
            System.out.println("Khong phai nam nhuan");
        }
    }
}
