package hello;
/* Get a time library */
import org.joda.time.LocalTime;

// Add a comment

// Benjamin Bond added a comment

public class HelloWorld 
{
	/* master comment */
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}

