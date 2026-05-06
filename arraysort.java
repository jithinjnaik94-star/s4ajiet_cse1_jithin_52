import java.util.ArrayList;
import java.util.Collections;

public class main{
    public static void main(String[] args){
        ArrayList<String>list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.size();
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(0));
        list.addFirst("10");
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
