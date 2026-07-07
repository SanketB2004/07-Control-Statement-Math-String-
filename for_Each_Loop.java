/**
 * for_Each_Loop
 */
public class for_Each_Loop {

    public static void main(String[] args) {
        

        
        String[] arr = new String[]{

            "Ram" , "Sita" , "Lakshman" , "Hanuman" 
        };
printArray(arr);

    }

    public static void printArray(String[] array){

        for (String name : array) {  // use for string print 
            System.out.print(name +" ");
        }

    }
}

// public class ForEachEven {

//     public static void main(String[] args) {

//         int[] arr = {10, 15, 20, 25, 30};

//         for (int num : arr) {

//             if (num % 2 == 0) {
//                 System.out.println(num);
//             }
//         }
//     }
// }