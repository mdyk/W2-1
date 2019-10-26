package w2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

class TestUnitAnnotations {

    @BeforeAll
    static void initAll() {
        System.out.println("@BeforeAll - wykonane raz, na początku");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach - wykonane przed każdym testem");
    }

    @Test
    void succeedingTest() {
        System.out.println("@Test - udany test");
    }

    @Test
    @Disabled
    void failingTest() {
        fail("Test nieudany");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        System.out.println("@Disabled - test pominięty");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach - wykonane po każdym teście");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("@AfterAll - wykonane raz, na końcu");
    }

}

