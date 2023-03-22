
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu rong");
        width= scanner.nextFloat();

        System.out.println("nhap vao chieu cao");
        height=scanner.nextFloat();
         float area = width*height;
        System.out.println("dien tich hinh chu nhat =" + area);

    }
}
