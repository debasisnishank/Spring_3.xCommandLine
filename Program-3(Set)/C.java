
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C {
   public  Set<String> list = new HashSet();
   //Parameterzied Constructor (value setting from xml file)
   public C(Set lists){
    list = lists;
   }
   public void show(){
    Iterator itr= list.iterator();
    while(itr.hasNext()){
        
        System.out.println(itr.next());
    }
   }
}
