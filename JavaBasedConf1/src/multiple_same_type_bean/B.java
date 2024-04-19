package multiple_same_type_bean;

import org.springframework.stereotype.Component;

@Component
public class B implements Test {

	@Override
	public void test() {
		System.out.println("Class B inside");
		
	}
     
}
