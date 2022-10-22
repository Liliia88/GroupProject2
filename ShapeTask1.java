package GroupProject2;
public interface ShapeTask1 {
    void calculateArea();
    void calculatePerimiter();
}
class Circle implements ShapeTask1 {
     public void calculateArea(){
         System.out.println("way of difinding area of circle is P*radius*radius.");
    }
    public void calculatePerimiter(){
        System.out.println("way of difinding perimiter of circle is 2*radius*P.");
    }
}
class Square implements ShapeTask1 {
    public void calculateArea(){
        System.out.println("way of difinding area of square is lenthside*lenthside.");
    }
    public void calculatePerimiter(){
        System.out.println("way of difinding perimiter of square is lenthside*4.");
    }
}
class tester34{
    public static void main(String[] args) {
        ShapeTask1[] shapeTask1 ={new Circle(), new Square()};
        for (ShapeTask1 s: shapeTask1){
            s.calculateArea();
            s.calculatePerimiter();
        }
    }
}

