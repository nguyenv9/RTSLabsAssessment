/************************************************
*  JUnit test for RTS Lab Methods
*  Vincent Nguyen 3/3/2022
************************************************/

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.lang.*;
import java.io.*;

public class RTSLabMethodsTest {
   HashMap<String, Integer> expectedResult = new HashMap<>();
   
   @Test
   public void testAboveBelowEmptyArray()
   {
      RTSLabMethods t = new RTSLabMethods();
      int [] test = {};      
      expectedResult.put("above", 0);
      expectedResult.put("below", 0);
      Assert.assertEquals(expectedResult, t.aboveBelow(test,5));
   }
   
   @Test
   public void testAboveBelowSingleIndexArray()
   {
      RTSLabMethods t = new RTSLabMethods();
      int [] test = {1};      
      expectedResult.put("above", 0);
      expectedResult.put("below", 1);
      Assert.assertEquals(expectedResult, t.aboveBelow(test,6));
   }
   
   @Test
   public void testAboveBelowArrayWithNegativeValues()
   {
      RTSLabMethods t = new RTSLabMethods();
      int [] test = {-3,-4,-45, 65, 9, 23};      
      expectedResult.put("above", 2);
      expectedResult.put("below", 4);
      Assert.assertEquals(expectedResult, t.aboveBelow(test,10));
   }
   
   @Test
   public void testStringRotationBlankString()
   {
      RTSLabMethods t = new RTSLabMethods();       
      Assert.assertEquals("", t.stringRotation("", 5));
   }
   
   @Test
   public void testStringRotationStringWithWhiteSpaceAtEnd()
   {
      RTSLabMethods t = new RTSLabMethods();       
      Assert.assertEquals("ello H", t.stringRotation("Hello ", 5));
   }
   
   @Test
   public void testStringRotationStringWithWhiteSpaceAtBeginning()
   {
      RTSLabMethods t = new RTSLabMethods();       
      Assert.assertEquals("Hello ", t.stringRotation(" Hello", 5));
   }
   
   @Test
   public void testStringRotationStringLengthSameAsRotations()
   {
      RTSLabMethods t = new RTSLabMethods();       
      Assert.assertEquals("Hello", t.stringRotation("Hello", 5));
   }
   
   @Test
   public void testStringRotation_RotationsGreaterThanLength()
   {
      RTSLabMethods t = new RTSLabMethods();       
      Assert.assertEquals("oHell", t.stringRotation("Hello", 6));
   }
   
   @Test
   public void testStringRotationNullString()
   {
      RTSLabMethods t = new RTSLabMethods();       
      Assert.assertEquals(null, t.stringRotation(null, 6));
   }
}
