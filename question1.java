import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class question1 {
    public static void main(String[] args) {
        List<Float> li = new ArrayList<>();
        float sum=0;
        li.add(5.1f);
        li.add(5.2f);
        li.add(6.5f);
        li.add(5.5f);
        li.add(9.5f);
        Iterator<Float> i =li.iterator();
        while(i.hasNext())
        {
            sum=sum+i.next();
        }
        System.out.println(sum);
    }
}
