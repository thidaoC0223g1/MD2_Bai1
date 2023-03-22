import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so thang trong nam");
        int month= input.nextInt();
         switch (month){
             case 2:
                 System.out.println(" thang co 28 hoac 29 ngay");
                 break;
             case 4:
             case 6:
             case 9:
             case 11:
                 System.out.println(" thang co 30 ngay");
                 break;
             default:
                 System.out.println(" thang co 31 ngay");
         }

    }
}
