package value_read_from_properties_file;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String name;
    private String eaddr;

public Employee(String s1,String s2)
          {
               name=s1;
               eaddr=s2;
          }
public void show()
 {
      System.out.println(name);
      System.out.println(eaddr);

 }

}
