import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C {
   public  List<String> list = new ArrayList<>();
   public C(List lists){
    list = lists;
   }
   public void show(){
    Iterator itr= list.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
        // C oc = (C) itr.next();
        // oc.show();
    }
   }
}
