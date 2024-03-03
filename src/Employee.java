import java.util.Objects;

public class Employee {

    //    Имя сотрудника
    private String name;
    //    Фамилия сотрудника
    private String middleName;
    //    Отчество сотрудника
    private String lastName;
    //    Отдел
    private int department;
    //    Зарплата сотрудника
    private int salary;
    //    id
    private int id = 0;


    //    Счетчик для id
    private static int idValue = 0;

    //    Метод для увеличения счетчика Id
    private void increaseidValue() {
        id = idValue;
        idValue += 1;
    }


    public Employee(String name, String middleName, String lastName, int department, int salary) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.setId(id);
        increaseidValue();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Objects.equals(name, employee.name) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName);
    }

    public int hashCode() {
        return Objects.hash(name, middleName, lastName, department, idValue);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }


    //<editor-fold desc="Getters-Setters">
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //</editor-fold>
}