package GroupProject2;

public abstract class Task2SecondWay {
    /*We have to calculate the average of marks obtained in three subjects by student A and by student B. Create class
   'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks. Provide
implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in three subjects
as its parameters and the marks in four subjects as its parameters for student B. Test your code*/
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
