package bean_priority;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] a) {
		ApplicationContext	applicationContext
		= new AnnotationConfigApplicationContext(Confi.class);
		C oc = (C) applicationContext.getBean("pqr");
	oc.play();
	}

}
