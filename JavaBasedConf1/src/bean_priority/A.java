package bean_priority;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class A implements Dao {
public void play() {
	System.out.println("Inside A");
}
}
