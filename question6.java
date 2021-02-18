import java.util.*;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
class SortByValue implements Comparator<Map.Entry<Integer, Integer>>{

    @Override
    public int compare( Map.Entry<Integer,Integer> entry1, Map.Entry<Integer,Integer> entry2){
        return (entry2.getValue()).compareTo( entry1.getValue() );
    }
}
public class question6{
    public static void main(String[] args) {
        int[] newarr={2,4,4,2,4,5,7,9,7};
        Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
        for(int i=0;i<newarr.length;i++)
        {
            if(!map1.containsKey(newarr[i]))
            {
                map1.put(newarr[i],1);
            }
            else
            {
                map1.put(newarr[i], map1.get(newarr[i])+1);
            }
        }
        map1.forEach((k,v)-> System.out.println("Val: "+k +" "+"Count: "+v));
        Set<Entry<Integer, Integer>> entrySet = map1.entrySet();
        System.out.println(entrySet);
        List<Entry<Integer, Integer>> listOfentrySet = new ArrayList<Entry<Integer, Integer>>(entrySet);
        Collections.sort(listOfentrySet, new SortByValue());
        for(Map.Entry<Integer, Integer> entry:listOfentrySet)
            System.out.print("Val: "+entry.getKey()+ " Count: "+entry.getValue()+"\n");

    }
}
