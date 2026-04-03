import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    @Test
    public void reverseStringTest()
    {
        ReverseString obj=new ReverseString();
        String actual=obj.reverseString("dhanalakshmi");
        String expected="imhskalanahd";
        assertEquals(actual,expected);
        System.out.println(expected);
    }

}
