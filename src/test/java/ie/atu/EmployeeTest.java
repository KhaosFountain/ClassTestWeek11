package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee emp = new Employee("Lokesh", "123456", "man", "12345678901", "full-time", 20);

    Employee emp2 = new Employee("bob", "1234567", "other", "123456789012", "intern", 17);

    @BeforeEach
    void setUp(){

    }



    @Test
    void geteName() {
        assertEquals(emp.geteName(), "Lokesh");
    }

    @Test
    void getNameFail(){

        Exception msg = assertThrows(IllegalArgumentException.class, () -> {
            emp2.geteName();
        });

        assertEquals("This name is too short", msg.getMessage());
    }



    @Test
    void getPPS() {
        assertEquals("123456", "123456");
    }

    @Test
    void getPPSFail(){
        Exception msg = assertThrows(IllegalArgumentException.class, () -> {
            emp2.getPPS();
        });

        assertEquals("Invalid PPS number", msg.getMessage());
    }




    @Test
    void getGender() {
        assertEquals("man", "man");
    }

    @Test
    void getGenderFail(){
        Exception msg = assertThrows(IllegalArgumentException.class, () -> {
            emp2.getGender();
        });

        assertEquals("Gender specified is invalid, try 'Man', 'Woman' or 'non-binary'", msg.getMessage());
    }



    @Test
    void getPhone() {
        assertEquals("12345678901", "12345678901");
    }

    @Test
    void getPhoneFail(){
        Exception msg = assertThrows(IllegalArgumentException.class, () -> {
            emp2.getPhone();
        });

        assertEquals("Phone number provided is invalid, number MUST be 11 characters long", msg.getMessage());
    }



    @Test
    void getEmpType() {
        assertEquals("full-time", "full-time");
    }

    @Test
    void getEmoTypeFail(){
        Exception msg = assertThrows(IllegalArgumentException.class, () -> {
            emp2.getEmpType();
        });

        assertEquals("Employee designation provided is invalid, try 'part-time' or 'full-time'", msg.getMessage());
    }

    @Test
    void getAge() {
        assertEquals(20, 20);
    }

    @Test
    void getAgeFail(){
        Exception msg = assertThrows(IllegalArgumentException.class, () -> {
            emp2.getAge();
        });

        assertEquals("This person is too young to work here, must be over 18", msg.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}