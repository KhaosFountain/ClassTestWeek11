package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
        Employee emp = new Employee("Lokesh", "123456", "man", "12345678901", "full-time", 20);

    }

    @Test
    void geteName() {
        assertEquals("Lokesh", "Lokesh");
    }

    @Test
    void getPPS() {
        assertEquals("123456", "123456");
    }

    @Test
    void getGender() {
        assertEquals("man", "man");
    }

    @Test
    void getPhone() {
        assertEquals("12345678901", "12345678901");
    }

    @Test
    void getEmpType() {
        assertEquals("full-time", "full-time");
    }

    @Test
    void getAge() {
        assertEquals(20, 20);
    }

    @AfterEach
    void tearDown() {
    }
}