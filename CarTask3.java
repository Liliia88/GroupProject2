package GroupProject2;

public class CarTask3 {
    double carPrice;
    String color;
    double calculateSalePrice(){
    return(carPrice);
    }
}
class Truck extends CarTask3{
 double weight;
 String calculateSaleprice(){
     if (weight>2000){
         return (String.valueOf(carPrice+(carPrice*0.1))+" $ is the price of Truck");
     } else {
          return (String.valueOf(carPrice+(carPrice*0.2))+" $ is the price of Truck");
     }
 }
}
class Sedan extends CarTask3 {
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