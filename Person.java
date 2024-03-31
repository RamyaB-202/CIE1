import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Person {
    private String name;
    private Date dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = parseDate(dob);
    }

    public void displayPersonName() {
        System.out.println("Person Name: " + name);
    }

    public void displayAge() {
        Date currentDate = new Date();
        long ageInMillis = currentDate.getTime() - dob.getTime();
        long ageInYears = ageInMillis / (1000L * 60 * 60 * 24 * 365);
        System.out.println("Age: " + ageInYears + " years");
    }

    private Date parseDate(String dob) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(dob);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format. Use yyyy-MM-dd or dd-MM-yyyy.");
        }
    }
    public static void main(String[] args) {
        // Create a Person
        Person person = new Person("John Doe", "1990-05-15");
        person.displayPersonName();
        person.displayAge();

        // Create an Employee
        Employee employee = new Employee("Alice Smith", "1985-08-20", 101, 60000.0);
        employee.displayPersonName();
    }
}
