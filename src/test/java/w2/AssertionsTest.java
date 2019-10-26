package w2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void assertionsExample() {
        assertEquals(2, 1 + 1);

        String s1 = "Example";
        String s2 = "Example";

        assertSame(s1,s2);
        assertEquals(s1,s2);

    }

}
