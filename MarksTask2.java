package GroupProject2;

public abstract class MarksTask2 {
    int math;
    int reading;
    int English;
    MarksTask2(int math,int reading,int English){
        this.math=math;
        this.reading=reading;
        this.English=English;
    }
    abstract void getPercentage();
}
class A extends MarksTask2{
    A(int math,int reading,int English){
        super(math,reading,English);
    }
    void getPercentage(){
        System.out.println("Everage score of class A is "+(math+reading+English)/3);
    }
}
class B extends MarksTask2{
    int Spanish;
   B(int math,int reading,int English, int Spanish){
       super(math,reading,English);
       this.Spanish=Spanish;
   }
    void getPercentage(){
        System.out.println("Everage score of class A is "+(math+reading+English+Spanish)/4);
    }
}
class tester32{
    public static void main(String[] args) {
        new A(50,45,34).getPercentage();
        new B(55,50,35,45).getPercentage();
    }
}