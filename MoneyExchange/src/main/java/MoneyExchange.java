import java.util.Scanner;
public class MoneyExchange {
    public static void main(String[] args) {
        System.out.println("ti gia hien tai 1 usd = 23000 vnd");
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so usd ");
        float usd = input.nextFloat();
        float vnd = usd*23000;
        System.out.println("so VND = "+ vnd);

    }
}
