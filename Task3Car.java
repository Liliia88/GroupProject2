package GroupProject2;
public class Task3Car {
    /*Create a Class Car that would have the following fields: carPrice and color and method
calculateSalePrice() which should be returning a price of the car.Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own implementation of calculateSalePrice() method in which returned price is
calculated as following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
The  Sedan class has field as length and also does it is own implementation of calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5% discount, otherwise 10% discount*/
    double carPrice;
    String color;
    double calculateSalePrice(){
    return(carPrice);
    }
}
class Truck extends Task3Car {
 double weight;
 String calculateSaleprice(){
     if (weight>2000){
         return (String.valueOf(carPrice+(carPrice*0.1))+" $ is the price of Truck");
     } else {
          return (String.valueOf(carPrice+(carPrice*0.2))+" $ is the price of Truck");
     }
 }
}
class Sedan extends Task3Car {
    double length;
    String calculateSaleprice(){
        if (length>20){
           return (String.valueOf(carPrice+(carPrice*0.05))+" $ is the price of Sedan");
        } else {
            return (String.valueOf(carPrice+(carPrice*0.1))+" $ is the price of Truck");
        }
    }
}
class tester31{
    public static void main(String[] args) {
        Truck truck=new Truck();
        truck.color="yellow";
        truck.weight=1950;
        truck.carPrice=10000;
        System.out.println(truck.calculateSaleprice());
        Sedan sedan=new Sedan();
        sedan.color="blue";
        sedan.length=21;
        sedan.carPrice=20000;
        System.out.println(sedan.calculateSaleprice());
    }
}