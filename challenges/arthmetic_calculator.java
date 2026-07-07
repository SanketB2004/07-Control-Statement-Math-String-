package challenges;

// Arthmetic calculator use to switch 


public class arthmetic_calculator {
    
    public static void main(String[] args) {
        
        int num1 = 5 ; 
        int num2=  5 ;

        char ccharacter = '*' ;

        int result = switch (ccharacter) {

            case '+'  ->  num1 + num2;
            case '/'  ->  num1 / num2;
            case '*'  ->  num1 * num2;
            case '-'  ->  num1 - num2;
            case '%'  ->  num1 % num2;

            default -> 0;
           

        };

        System.out.println(result);
    }
}
