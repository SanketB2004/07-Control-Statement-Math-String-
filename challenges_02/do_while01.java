package challenges_02;

public class do_while01 {
    
    public static void main(String[] args) {
        String password ;

        do {
            System.out.println("Is valid");
            password = 123456;
            
        } while (!isvalid(password));

        System.out.println();
    }

    public static boolean isvalid(String password){

        return password.length<=5;
    }

}
