import java.util.Scanner;

public class SpeakNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so can doc");
        int num = input.nextInt();
        int tram = num / 100;
        int chuc2 = num % 100;
        int chuc=chuc2/10;
        int dv = chuc2 % 10;
        String tram1="";
        String chuc1="";
        String dv1="";

        if(num>1000){
            System.out.println("out of ability");
        }else if (num>0){
            switch (tram){
                case 0: break;
                case 1:  tram1="one hundred ";break;
                case 2:  tram1="two hundred ";break;
                case 3:  tram1="three hundred ";break;
                case 4:  tram1="four hundred ";break;
                case 5:  tram1="five hundred ";break;
                case 6:  tram1="six hundred ";break;
                case 7:  tram1="seven hundred ";break;
                case 8:  tram1="eight hundred ";break;
                case 9:  tram1="nine hundred ";break;

            }
            switch (chuc){
                case 0: break;
                case 1:  chuc1="ten ";break;
                case 2:  chuc1="twenty ";break;
                case 3:  chuc1="thirty ";break;
                case 4:  chuc1="forty ";break;
                case 5:  chuc1="fifty ";break;
                case 6:  chuc1="sixty ";break;
                case 7:  chuc1="seventy ";break;
                case 8:  chuc1="eighty ";break;
                case 9:  chuc1="ninety ";break;

            }
            switch (dv){
                case 0:  break;
                case 1:  dv1="one";break;
                case 2:  dv1="two ";break;
                case 3:  dv1="three ";break;
                case 4:  dv1="four ";break;
                case 5:  dv1="five ";break;
                case 6:  dv1="six ";break;
                case 7:  dv1="seven ";break;
                case 8:  dv1="eight ";break;
                case 9:  dv1="nine ";break;

            }
            System.out.println(tram1+chuc1+dv1);
        }else{
            System.out.println("zero");
        }
    }

}



