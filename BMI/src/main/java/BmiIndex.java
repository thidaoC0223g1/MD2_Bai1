import java.util.Scanner;

public class BmiIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao can nang");
        double weight = input.nextDouble();
        System.out.println("nhap vao chieu cao");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.printf("%s%6.2f%s","chi so bmi = ", bmi ," ban qua gay");
        } else if ( bmi < 25) {
            System.out.printf("%s%6.2f%s","chi so bmi = ", bmi ," the trang binh thuong");
        } else if ( bmi < 30) {
            System.out.printf("%s%6.2f%s","chi so bmi = ", bmi ," ban hoi nang can roi");
        } else {
            System.out.printf("%s%6.2f%s","chi so bmi = ", bmi ," ban beo phi");
        }
    }
}
