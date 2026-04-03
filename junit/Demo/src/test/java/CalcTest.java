import com.dhana.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    @org.junit.jupiter.api.Test
    public void addTest()
    {
        Calc obj=new Calc();
        int result=obj.add(23,3);
        assertEquals(26,result);
    }

}
