import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClassAverageTest {

    ClassAverage  classAverage = new ClassAverage();

    @Test
    public void testThatObjectCanBeCreated(){
        assertNotNull(classAverage);
    }

    @Test
    public void testThatICanGetAverage(){
         classAverage.setAverage(10);
         classAverage.setAverage(15);
         classAverage.setAverage(20);
         classAverage.setAverage(25);
         classAverage.setAverage(30);
         classAverage.setAverage(35);
         classAverage.setAverage(40);
         classAverage.setAverage(45);
         classAverage.setAverage(50);
         classAverage.setAverage(55);
      double average =  classAverage.calculateAverage();
        assertEquals(32.5, average);
    }





}
