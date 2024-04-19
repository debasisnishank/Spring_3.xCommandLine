package autowired_Field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import autowired_Setter.Conf;

public class Main {
 public static void main(String[] a) {
	// TODO Auto-generated method stub
	ApplicationContext ac = new AnnotationConfigApplicationContext(autowired_Field.Conf.class);
	V ov = (V) ac.getBean("v");
	ov.showV();
}
}
