import java.util.HashSet;

public class main{
    public static void main(String[] args){
       HashSet<Integer> ai=new HashSet<>();
       ai.add(2);
       ai.add(20);
       ai.add(10);
       System.out.println(ai.contains(10));
       ai.remove(2);
       System.out.println(ai);
     }
}
