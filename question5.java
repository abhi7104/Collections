import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    String Name;
    double Score,Age;
    Student(String Name,double Score,double Age){
        this.Age=Age;
        this.Name=Name;
        this.Score=Score;
    }
    public String toString(){
        return ("Name: "+Name+" Age: "+Age+" Score: "+Score+"\n");
    }
    public double getScore()
    {
        return Score;
    }
    public String getName()
    {
        return Name;
    }
}

public class question5 {
    public static void main(String[] args) {
        List<Student> l=new ArrayList<Student>();
        l.add(new Student("bansal",50,23.2));
        l.add(new Student("amit",50,24));
        l.add(new Student("ravi",45,22.4));
        l.add(new Student("ram",55,24.6));
        Collections.sort(l, Comparator.comparing(Student::getScore)
                .thenComparing(Student::getName));
        System.out.println(l);
    }
}
