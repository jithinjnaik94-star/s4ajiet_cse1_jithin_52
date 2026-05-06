import java.util.TreeSet;

public class main{
    public static void main(String[] args){
       TreeSet<Integer> ai=new TreeSet<>();
       ai.add(2);
       ai.add(20);
       ai.add(10);
       System.out.println(ai.contains(10));
       ai.remove(2);
       System.out.println(ai);
     }
}
