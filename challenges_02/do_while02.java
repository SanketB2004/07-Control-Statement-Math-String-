package challenges_02;
import java.util.Scanner;

/**
 * do_while02
 */
public class do_while02 {

    // number gassing game used  to do while number 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 5 ,  guess ;

        System.out.println("Welcome to number gassing game");

        do {
            System.out.println("Please gassing number 0 to 10");
        guess = sc.nextInt();

            
        } while (num!= guess);

        System.out.println("You have wins");


    }
}