/**
 * toString
 */
public class toString {

    int noOfWheels;

    int noofDoors;

    int maxspeed;

    String name;

    String moduleNumber;

    String company;

    public toString(int noOfWheels, int noofDoors, int maxspeed, String name, String moduleNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noofDoors = noofDoors;
        this.maxspeed = maxspeed;
        this.name = name;
        this.moduleNumber = moduleNumber;
        this.company = company;
    }
// @Override
// public String toString() {
//     // TODO Auto-generated method stub
//     return "My car name is " + name;
// }// toString Method  

// aUTOMATIC TO STRING USE RIGHT CLICK AND GO SOURSE ACTION

@Override
public String toString() {
    // TODO Auto-generated method stub
    return "toString{nuOfWheels="+noOfWheels+"}";
}

public static void main(String[] args) {
    
    toString My = new toString(4, 5, 100, "Swift", "SUVBIG", "Maruti");

    System.out.println(My); //  
}

// @Override
// public String toString() {
//     return "toString [noOfWheels=" + noOfWheels + ", noofDoors=" + noofDoors + ", maxspeed=" + maxspeed + ", name="
//             + name + ", moduleNumber=" + moduleNumber + ", company=" + company + "]";
// }// THIS IS TOsTRING METHOD 


    
}