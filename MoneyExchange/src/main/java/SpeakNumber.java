import java.util.Scanner;

public class SpeakNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so can doc");
        int num = input.nextInt();
        int tram = num / 100, chuc = (num % 100) / 10, dv = (num % 100) % 10;
        String tram1 = "", chuc1 = "", dv1 = "";
        if (num > 1000) {
            System.out.println("out of ability");
        } else if (num >= 20 || num <= 10) {
            switch (tram) {
                case 0:
                    break;
                case 1:
                    tram1 = "one hundred ";
                    break;
                case 2:
                    tram1 = "two hundred ";
                    break;
                case 3:
                    tram1 = "three hundred ";
                    break;
                case 4:
                    tram1 = "four hundred ";
                    break;
                case 5:
                    tram1 = "five hundred ";
                    break;
                case 6:
                    tram1 = "six hundred ";
                    break;
                case 7:
                    tram1 = "seven hundred ";
                    break;
                case 8:
                    tram1 = "eight hundred ";
                    break;
                case 9:
                    tram1 = "nine hundred ";
                    break;
            }
            switch (chuc) {
                case 0:
                    break;
                case 1:
                    chuc1 = "ten ";
                    break;
                case 2:
                    chuc1 = "twenty ";
                    break;
                case 3:
                    chuc1 = "thirty ";
                    break;
                case 4:
                    chuc1 = "forty ";
                    break;
                case 5:
                    chuc1 = "fifty ";
                    break;
                case 6:
                    chuc1 = "sixty ";
                    break;
                case 7:
                    chuc1 = "seventy ";
                    break;
                case 8:
                    chuc1 = "eighty ";
                    break;
                case 9:
                    chuc1 = "ninety ";
                    break;
            }
            switch (dv) {
                case 0 -> dv1 = "zero";
                case 1 -> dv1 = "one";
                case 2 -> dv1 = "two ";
                case 3 -> dv1 = "three ";
                case 4 -> dv1 = "four ";
                case 5 -> dv1 = "five ";
                case 6 -> dv1 = "six ";
                case 7 -> dv1 = "seven ";
                case 8 -> dv1 = "eight ";
                case 9 -> dv1 = "nine ";
            }
            System.out.println(tram1 + chuc1 + dv1);
        } else {
            switch (num) {
                case 11 -> System.out.println("eleven");
                case 12 -> System.out.println("twelve");
                case 13 -> System.out.println("thirteen");
                case 14 -> System.out.println("fourteen");
                case 15 -> System.out.println("fifteen");
                case 16 -> System.out.println("sixteen");
                case 17 -> System.out.println("seventeen");
                case 18 -> System.out.println("eighteen");
                case 19 -> System.out.println("nineteen");
            }
        }

    }
}


