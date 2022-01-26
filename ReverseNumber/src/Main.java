import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Number :- ");
        int num = scan.nextInt();

        int tmp = num;

        int result = 0;

        int s = 0;


        while (tmp !=0){

            result = tmp % 10;

            s = s * 10 + result;

            tmp = tmp / 10;

        }

        System.out.println(num + " Revers is " + s);



    }
}
