import static org.junit.Assert.*;

import org.junit.Test;

package example2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeasurementTest {

    @Test
    public void testAdd() {
        Measurement m1 = new Measurement(15);
        Measurement m2 = new Measurement(30);
        m1.add(m2);
        assertEquals(45, m1.getValue());
    }

    @Test
    public void testSub() {
        Measurement m1 = new Measurement(15);
        Measurement m2 = new Measurement(30);
        m2.sub(m1);
        assertEquals(15, m2.getValue());
    }

}