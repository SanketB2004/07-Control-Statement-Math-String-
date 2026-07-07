package challenges;

// absolute number use ternary op
public class abslutnum {

    public static void main(String[] args) {
        int num = -98;

        int ternary = num >= 0 ? num : -num;

        System.out.println(ternary);
    }

}
