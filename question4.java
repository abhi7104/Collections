import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    String Name;
    double Salary,Age;
    Employee(String Name,double Salary,double Age){
        this.Age=Age;
        this.Name=Name;
        this.Salary=Salary;
    }
    public String toString(){
        return ("Name: "+Name+" Age: "+Age+" Salary: "+Salary);
    }
}

class SortbySal implements Comparator<Employee>
{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return (int) (emp1.Salary - emp2.Salary);
    }
}

public class question4 {
    public static void main(String[] args) {
        List<Employee> l=new ArrayList<Employee>();
        l.add(new Employee("Abhishek",80000.12,28));
        l.add(new Employee("Rakesh",34000.213,23));
        l.add(new Employee("Shiva",65000.12,30));
        l.add(new Employee("Ram",89999.12,35));
        Collections.sort(l, new SortbySal());
        System.out.println(l);
        System.out.println("highest salary is: " + l.get(l.size()-1).Salary);
    }
}
