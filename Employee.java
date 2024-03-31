class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, String dob, int empId, double salary) {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    @Override
    public void displayPersonName() {
        super.displayPersonName();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}