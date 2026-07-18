package Recursion;

import java.util.Scanner;

/**
 * Recursionn
 */
public class Recursionn {

    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
System.out.println("Welcome to facgtorial genretor");



     int num = sc.nextInt();

     long fact = factorialRecursion(num);

     System.out.println(fact);





    }
 public static long factorialRecursion(int num){

if (num == 1) {
    return 1 ;
}
return num * factorialRecursion(num-1);
 }

    public static long factorial(int num){
long result = 1;

for (int i = 0; i <= num; i++) {
    result*=i;
}
          

        return result;
    }
}