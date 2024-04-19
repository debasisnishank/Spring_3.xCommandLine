package p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import p1.A;
import p1.B;

public class Main {

	public static void main(String[] args) {
		  ApplicationContext context = new AnnotationConfigApplicationContext(myConf.class);
	        A ob1 = (A) context.getBean(A.class);
	       ob1.show();
	       B ob2 = (B) context.getBean(B.class);
	       ob2.show();
	}

}
