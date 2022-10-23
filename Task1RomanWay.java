package GroupProject2;

public interface Task1RomanWay {
        void calculateArea(double radius);
        void calculatePerimiter(double length);
    }
    class Circle2 implements Task1RomanWay {
        @Override
        public void calculateArea(double radius) {
            double area=3.1415;
            System.out.println("The area of a cicle with the radius of "+ radius+ " is = "+radius*radius*area);
        }
        @Override
        public void calculatePerimiter(double length){
        }
    }
    class Square2 implements Task1RomanWay{
        @Override
        public void calculatePerimiter(double length) {
            System.out.println("The Perimiter of a square with the length of "+length+" is = "+4*length);
        }
        @Override
        public void calculateArea(double radius) {
        }
    }
class ShapeTester {
    public static void main(String[] args) {
        Task1RomanWay circle= new Circle2();
        circle.calculateArea(5);

        Task1RomanWay square = new Square2();
        square.calculatePerimiter(5);

    }
}
