import java.util.List;
import java.util.Objects;

public class Employee {
    private String name;
    private int salary;
   public Employee (String name, int salary){
       this.name=name;
       this.salary=salary;
   }
    public void setName(String name) {

        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    public Employee getEmpSal(List<Employee> names) {
        int max = 0;


        for (Employee i : names)
            if (i.getSalary() > max)
                max = i.salary;


        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return salary == employee.salary && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
