package hello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Change the comment again to kick off a build

public class TestGreeter {

   private Greeter g = new Greeter();

   @Test
   @DisplayName("Test for Empty Name")
   public void testGreeterEmpty() 

   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }



   @Test
   @DisplayName("Test for Name='World'")
   public void testGreeter() 
   {

      g.setName("World");
      assertEquals(g.getName(),"World");
      assertEquals(g.sayHello(),"Hello World!");
   }

   @Test
   @DisplayName("Test for Name='Benjamin Bond'")
   public void testGreeterMyName() 

   {
      g.setName("Benjamin Bond");
      assertEquals(g.getName(),"Benjamin Bond");
      assertEquals(g.sayHello(),"Hello Benjamin Bond!");
   }

}
