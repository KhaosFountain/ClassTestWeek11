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

        int size = eName.length();

        if(size <5){
            throw  new IllegalArgumentException("This name is too short");
        }
        else{
            return eName;
        }
    }

    public String getPPS() {

        int size = PPS.length();

        if(size < 6 || size > 6){
            throw new IllegalArgumentException("Invalid PPS number");
        }
        else{
            return PPS;
        }
    }

    public String getGender() {

        if(gender != "man" || gender != "woman" || gender != "non-Binary"){
            throw new IllegalArgumentException("Gender specified is invalid, try 'Man', 'Woman' or 'non-binary'");
        }
        else{
            return gender;
        }
    }

    public String getPhone() {
        int size = phone.length();

        if(size != 11){
            throw new IllegalArgumentException("Phone number provided is invalid, number MUST be 11 characters long");
        }
        else{
            return phone;
        }
    }

    public String getEmpType() {

        if(empType != "full-time" || empType != "part-time"){
            throw new IllegalArgumentException("Employee designation provided is invalid, try 'part-time' or 'full-time'");
        }
        else{
            return empType;
        }
    }

    public int getAge() {

        if(age < 18){
            throw new IllegalArgumentException("This person is too young to work here, must be over 18");
        }
        else{
            return age;
        }

    }
}