
/**
 * Write a description of class CarDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDriver
{
    public static void main(String[] args){
        Car myCar = new Car("Dodge", 2016);
        System.out.println(myCar);
        
        Car yourCar = new Car("Dodge", 2016);
        
        System.out.println(myCar.equals(yourCar));
    }
}
