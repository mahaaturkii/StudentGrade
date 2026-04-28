package studentgrade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * updated by Maha:update the test class using Junit4.12 library 
 * Maintenance type: Adaptive Maintenance (updated the code and libraries to adapt to modren testing standards and resolve enviroment compatibility issues)
 * 
 * @author maha
 */
public class StudentGradeTest {
    
     @Test
    public void testGetGrade95() {
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
      @Test
    public void testGetGrade85() {
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
       @Test
    public void testGetGrade75() {
        System.out.println("getGrade 85");
        int mark = 75;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
}
