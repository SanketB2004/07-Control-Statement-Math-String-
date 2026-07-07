import java.util.*;

public class Do_While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;

        do {
            System.out.print("Please Enter Your Age: ");
            age = sc.nextInt();   // int काढून टाक
        } while (age < 0 || age > 100);

        System.out.println("Your Age: " + age);

        
    }
}