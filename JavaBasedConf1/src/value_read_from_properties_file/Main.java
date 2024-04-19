package value_read_from_properties_file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac = new AnnotationConfigApplicationContext(Confi.class);
    Employee emp = (Employee)ac.getBean("emp");
    emp.show();
	}

}
