package GroupProject2;

public class Task3SecondWayConstructor {
    /*Create a Class Car that would have the following fields: carPrice and color and method
calculateSalePrice() which should be returning a price of the car.Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own implementation of calculateSalePrice() method in which returned price is
calculated as following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.*/
    double carPrice;
    String color;
    Task3SecondWayConstructor(double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    double calculateSalePrice(){
        return(carPrice);
    }
}
class Truck2 extends Task3SecondWayConstructor {
    double weight;
    Truck2(double carPrice,String color,double weight){
        super(carPrice,color);
        this.weight=weight;
    }
    String calculateSaleprice(){
        if (weight>2000){
            return (String.valueOf(carPrice+(carPrice*0.1))+" $ is the price of Truck");
        } else {
            return (String.valueOf(carPrice+(carPrice*0.2))+" $ is the price of Truck");
        }
    }
}
class Sedan2 extends Task3SecondWayConstructor {
    double length;
    Sedan2(double carPrice,String color,double length){
        super(carPrice,color);
        this.length=length;
    }
    String calculateSaleprice(){
        if (length>20){
            return (String.valueOf(carPrice+(carPrice*0.05))+" $ is the price of Sedan");
        } else {
            return (String.valueOf(carPrice+(carPrice*0.1))+" $ is the price of Truck");
        }
    }
}
class tester36{
    public static void main(String[] args) {
        new Truck2(10000,"yellow",1950).calculateSaleprice();
        new Sedan2(20000,"blue",21).calculateSaleprice();
    }
}

