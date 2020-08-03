public class RegularEmployee extends Employee {
    protected long salary; protected String hireDate;
    public RegularEmployee(String name, String birthDate, long salary, String hireDate) {
        this(name, birthDate ,salary ,hireDate);
        this.salary = salary;
        this.hireDate = hireDate;
    }
}