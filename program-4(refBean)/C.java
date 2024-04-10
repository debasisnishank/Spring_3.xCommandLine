
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C {
   B ob;
   //Parameterzied Constructor (value setting from xml file)
   public C(B  ob){
    this.ob= ob;
   }
   public void show(){
   System.out.println(this.ob.getMessage());
   }
}
