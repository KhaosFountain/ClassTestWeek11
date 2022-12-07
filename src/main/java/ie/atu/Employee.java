package ie.atu;

public class Employee {

    String eName;           // 5 characters max, minimum 22 characters
    String PPS;             // 6 characters in length otherwise the pps number is invalid
    String gender;          // man, woman, non-bianary
    String phone;           // must be 11 digit number
    String empType;         // part-time, full-time etc
    int age;                // must be over 18


    public Employee(String eName, String PPS, String gender, String phone, String empType, int age) {
        this.eName = eName;
        this.PPS = PPS;
        this.gender = gender;
        this.phone = phone;
        this.empType = empType;
        this.age = age;
    }

    public String geteName() {
        return eName;
    }

    public String getPPS() {
        return PPS;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmpType() {
        return empType;
    }

    public int getAge() {
        return age;
    }
}
