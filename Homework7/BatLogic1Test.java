import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class BatLogic1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void addDoubleTests() {
      Assert.assertEquals("error when x = 1.1 and y = 1.0", 2.1,
      BatLogic1.addDouble(1.1, 1.0), 0.001);
   }
   
   @Test public void summerTests() {
      Assert.assertEquals("squirrel error when 95 and summer.", true,
      BatLogic1.squirrelPlay(95, true));
      
      Assert.assertEquals("squirrel error when 100 and summer.", true,
      BatLogic1.squirrelPlay(100, true));
      
      Assert.assertEquals("squirrel error when 59 and summer.", false,
      BatLogic1.squirrelPlay(59, true));  
      
      Assert.assertEquals("squirrel error when 90 and summer.", true,
      BatLogic1.squirrelPlay(90, true));
      
      Assert.assertEquals("squirrel error when 50 and summer.", false,
      BatLogic1.squirrelPlay(50, true));
   }
      
   @Test public void nonSummerTests() {
      Assert.assertEquals("squirrel error when 70 and not summer.", true,
      BatLogic1.squirrelPlay(70, false));
      
      Assert.assertEquals("squirrel error when 100 and not summer.", false,
      BatLogic1.squirrelPlay(100, false));
      
      Assert.assertEquals("squirrel error when 90 and not summer.", true,
      BatLogic1.squirrelPlay(90, false));
      
      Assert.assertEquals("squirrel error when 59 and not summer.", false,
      BatLogic1.squirrelPlay(59, false));
      
      Assert.assertEquals("squirrel error when 60 and not summer.", true,
      BatLogic1.squirrelPlay(60, false));
   }
}