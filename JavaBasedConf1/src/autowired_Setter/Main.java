package autowired_Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ApplicationContext ac = new AnnotationConfigApplicationContext(Conf.class);
  B  ob = (B)ac.getBean("b");
  ob.play();
	}

}
