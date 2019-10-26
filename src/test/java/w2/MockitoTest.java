package w2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoTest {

    @Test
    public void test1()  {
        MyClass test = mock(MyClass.class);
        when(test.getUniqueId()).thenReturn(43d);
        assertEquals(test.getUniqueId(), 43);
    }

}
