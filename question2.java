public class question2 {
    int find_unique(String str)
    {
        String temp="";
        for(int i=0;i<str.length();i++)
        {
            char cur= str.charAt(i);
            if(temp.indexOf(cur)<0)
            {
                temp=temp+cur;
            }
            else
                temp=temp.replace(String.valueOf(cur),"");
        }
        return temp.length();
    }
    public static void main(String[] args) {
        question2 q2=new question2();
        System.out.println(q2.find_unique("abhiabi"));
    }
}
