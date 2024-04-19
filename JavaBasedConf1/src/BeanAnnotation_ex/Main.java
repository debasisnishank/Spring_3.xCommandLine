package BeanAnnotation_ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				new AnnotationConfigApplicationContext(Configuration.class);
	    DaoImpl1 dao1 =  (DaoImpl1) context.getBean("dao1");
	    DaoImpl2 dao2 =  (DaoImpl2) context.getBean(DaoImpl2.class);
	    dao1.show();
	    dao2.show();
	
	}

}
