package GroupProject2;
public interface Task4WebDriver {
     /*Provide Implementation for the diagram below. Then create a test class in which you need to create Objects of
 ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them.*/
void open();
void close();
String getTitle();
}
interface RemoteWebdriver extends Task4WebDriver {
    void navigate();
}
interface TakesScreenShot extends RemoteWebdriver{
    void getScreenshot();
}
class ChromeDriver implements RemoteWebdriver{
    public void open(){
        System.out.println("open a Chrome driver");
    }
    public void close(){
        System.out.println("close a Chrome driver");
    }
    public String getTitle(){
        return ("get title Chrome");
    }
    public void navigate(){
        System.out.println("Get Chrome driver");
    }
    public void getScreenshot(){
        System.out.println("get screenshot of Chrome web browser");
    }
}
class FirefoxDriver implements RemoteWebdriver{
    public void open(){
        System.out.println("open a Firefox driver");
    }
    public void close(){
        System.out.println("close a Firefox driver");
    }
    public String getTitle(){
        return ("get title Firefox");
    }
    public void navigate(){
        System.out.println("Get Firefox driver");
    }
    public void getScreenshot(){
        System.out.println("get screenshot of Firefox web browser");
    }
}
 class SafariDriver implements RemoteWebdriver{
     public void open(){
         System.out.println("open a Safari driver");
     }
     public void close(){
         System.out.println("close a Safari driver");
     }
     public String getTitle(){
         return ("get title Safari");
     }
     public void navigate(){
         System.out.println("Get Safari driver");
     }
     public void getScreenshot(){
         System.out.println("get screenshot of Firefox web browser");
     }
 }
 class tester30 {
     public static void main(String[] args) {
         RemoteWebdriver[] remote={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
         for (RemoteWebdriver r:remote){
             r.open();
             r.close();
             System.out.println(r.getTitle());
             r.navigate();
         }
     }
 }

