package multiple_same_type_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = 
				new AnnotationConfigApplicationContext(multiple_same_type_bean.Conf.class);
		C oa = (C)ac.getBean(C.class);
		oa.show();

	}

}
