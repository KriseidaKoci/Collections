import java.util.*;

public class CollectionTest {

    public ArrayList<Integer> getNumber(ArrayList<Integer> num) {
        ArrayList<Integer> num1 = new ArrayList<>();

        for (int i = 0; i < num.size(); i++) {
            if ((num.get(i) % 2) == 0) {
                num1.add(num.get(i));
            }

        }

        return num1;
    }

    public List<String> capitalWords(ArrayList<String> word1) {
        List<String> words2 = new ArrayList<>();
        for (int i = 0; i < word1.size(); i++) {
            words2.add(word1.get(i).toUpperCase());

        }

        return words2;

    }

    public Boolean proveWords(ArrayList<String> names, String name) {
        for (String i : names) {
            if (i.equalsIgnoreCase(name)) {
                return true;

            }

        }


        return false;
    }

    public List deleteEmployee(List<Employee> bank, String name) {
        Employee employee = new Employee("", 0);
        for (int i = 0; i < bank.size(); i++)
            if (employee.getName() == name) {
                bank.add(bank.size() - 1, employee);

            }

        for (int i = bank.size() - 1; i >= 0; i--) {
            while (employee.getName() == name) ;

            {
                bank.remove(employee);
            }


        }


        return bank;
    }

    @Override
    public String toString() {
        return "CollectionTest{}";
    }

    public void printEmp(Set<Employee> employees) {
        for (Employee i : employees) {
            System.out.println(i.toString());
        }
    }


    public boolean compareSets(Set<Employee> employees1, Set<Employee> employees2) {
        if (employees1.containsAll(employees2)) {
            return true;
        }

        return false;
    }

    public Set<String> compareValues(Set<String> names1, Set<String> names2) {
        Set<String> values = new HashSet<>();
        for (String i : names1) {
            if (names2.contains(i)) {
                values.add(i);

            }

        }

        return values;
    }

    public boolean proveHashmap(Map<Integer, List<Employee>> employees2, String name) {

        for (List<Employee> employee : employees2.values()) {
            for (Employee employee1 : employee) {
                if (employee1.getName().equalsIgnoreCase(name)) {
                    return true;
                }
            }


        }

        return false;


    }


}
