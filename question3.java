import java.util.HashMap;
import java.util.Map;
public class question3 {
    void getOcc(String str)
    {
        char[] newarr=str.toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<newarr.length;i++)
        {
            if(!map.containsKey(newarr[i]))
            {
                map.put(newarr[i],1);
            }
            else
            {
                map.put(newarr[i], map.get(newarr[i])+1);
            }
        }
        map.forEach((k,v)-> System.out.println("Char: "+k +" "+"Count: "+v));
    }
    public static void main(String[] args) {
        question3 q3=new question3();
        q3.getOcc("abhishek bhardwaj");
    }
}
