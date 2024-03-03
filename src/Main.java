public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов", "Иван", "Иванович",1,55000);
        employees[1] = new Employee("Петров", "Петр", "Петрович",3,25000);
        employees[2] = new Employee("Сидоров", "Сидор", "Сидорович",2,15000);
        employees[3] = new Employee("Кузнецов", "Алексей", "Александрович",5,77000);
        employees[4] = new Employee("Пушкин", "Валентин", "Эдуардович",5,100000);
        employees[5] = new Employee("Ноздрев", "Василий", "Викторович",4, 33000);
        employees[6] = new Employee("Васильев", "Василий", "Васильевич",1, 66000);
        employees[7] = new Employee("Шишкин", "Виктор", "Васильевич",2, 44000);
        employees[8] = new Employee("Андреев", "Андрей", "Андреевич",5, 32000);
        employees[9] = new Employee("Кириллов", "Кирилл", "Кириллович",2, 10000);


        getAllEmployees();
        printAllEmployeesFullName();
        System.out.println(getAllSalariesSum());
        System.out.println(getMinSalaryEmployee());
        System.out.println(getMaxSalaryEmployee());
        System.out.println(getAvgSalaryEmployee());
    }

    public static void getAllEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public static void printAllEmployeesFullName() {
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " " + emp.getMiddleName() + " " + emp.getLastName());
        }
    }

    public static int getAllSalariesSum(){
        int sum =0;
        for (Employee emp : employees) {
            sum += emp.getSalary();
        }
        return sum;
    }

    public static Employee getMinSalaryEmployee(){
        int minSalary = Integer.MAX_VALUE;
        Employee minSalaryEmp = null;
        for (Employee emp : employees) {
            if (emp.getSalary() < minSalary) {
                minSalary = emp.getSalary();
                minSalaryEmp = emp;
            }
        }
        return minSalaryEmp;
    }

    public static Employee getMaxSalaryEmployee(){
        int maxSalary = Integer.MIN_VALUE;
        Employee maxSalaryEmp = null;
        for (Employee emp : employees) {
            if (emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
                maxSalaryEmp = emp;
            }
        }
        return maxSalaryEmp;
    }

    public static double getAvgSalaryEmployee() {
        int paySum = 0;
        for (Employee emp : employees) {
            paySum += emp.getSalary();
        }
        return ((double) paySum)/employees.length;
    }
}