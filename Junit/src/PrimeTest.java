import static org.junit.Assert.*;
 
import java.util.*;
 
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
 
import org.junit.runners.Parameterized.Parameters;
 
@RunWith(Parameterized.class)
public class PrimeTest {

    private Integer input;
    private Boolean expectedResult;
    Prime p;

    public PrimeTest(Integer nums,Boolean expectedResult)
    {
        input=nums;
        this.expectedResult=expectedResult;
    }

    @Parameterized.Parameters
    public static Collection pNums()
    {
        return Arrays.asList(new Object[][] {

            {2,true},
            {6,false},
            {19,true},
            {22,false},
            {23,true},
        });
    }
    @Before
    public void initialize()
    {
        p=new Prime();
    }
 
    @Test
    public void testValidate() {

        assertEquals(expectedResult,p.validate(input) );

    }
 
}