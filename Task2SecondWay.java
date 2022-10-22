package GroupProject2;

public abstract class Task2SecondWay {
    abstract void getPercentage();
}
class A1 extends Task2SecondWay {
    int math;
    int reading;
    int English;
    A1(int math,int reading,int English){
        this.math=math;
        this.reading=reading;
        this.English=English;
    }
    void getPercentage(){
        System.out.println("Everage score of class A is "+(math+reading+English)/3);
    }
}
class B1 extends Task2SecondWay {
    int math;
    int reading;
    int English;
    int Spanish;
    B1(int math,int reading,int English, int Spanish){
        this.math=math;
        this.reading=reading;
        this.English=English;
        this.Spanish=Spanish;
    }
    void getPercentage(){
        System.out.println("Everage score of class A is "+(math+reading+English+Spanish)/4);
    }
}
class tester33{
    public static void main(String[] args) {
        new A1(50,45,34).getPercentage();
        new B1(55,50,35,45).getPercentage();
    }
}
