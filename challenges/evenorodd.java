package challenges;

/**
 * even or odd
 */
public class evenorodd {

    public static void main(String[] args) {

        int a = 5;

        String ternary = a % 2 == 0 ? "Even" : "Odd";

        System.out.println(ternary);
    }
}