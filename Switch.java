/**
 * Switch
 */
public class Switch {

    public static void main(String[] args) {
        
    //   int a = 0;

    //   switch (a) {
    //     case 1:
    //         System.out.println("Mon");
    //         break;
    //         case 2:
    //         System.out.println("tue");
    //         break;
    //         case 3:
    //         System.out.println("wend");
    //         break;
    //         case 4:
    //         System.out.println("thi");
    //         break;
    //         case 5:
    //         System.out.println("fri");
    //         break;
    //         case 6:
    //         System.out.println("satur");
    //          break;
    //         case 7:
    //         System.out.println("saunday");
    //         break;
            
      
    //     default:System.out.println("Hanuman Day");
    //         break;
    //   }
    // 
    // 
    // System.out.println() किंवा ब्लॉक लागतो. आणि जर value return करायची असेल तर switch expression वापरून variable मध्ये store करावी लागते.

    // ehanced pattern java Switch Operator
         
int a = 2;

String day = switch (a) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Invalid";
};

System.out.println(day);

    }}
