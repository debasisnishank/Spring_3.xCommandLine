package multiple_same_type_bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class C {
private Test test;
@Autowired
public void setTest(Test t) {
	test = t;
}
public void show() {
	test.test();
}
}
