package multiple_same_type_bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class A implements Test {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Test A");
	}

}
