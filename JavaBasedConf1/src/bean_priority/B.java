package bean_priority;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class B implements Dao{
public void play() {
	System.out.println("Inside th B");
}
}
