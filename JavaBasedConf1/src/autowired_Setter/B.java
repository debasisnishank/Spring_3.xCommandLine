package autowired_Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("b")
public class B {
 private A ob;
 @Autowired
public void setOb(A obm) {
	ob = obm;
}
 public void play() {
	 ob.showResult();
 }
}
