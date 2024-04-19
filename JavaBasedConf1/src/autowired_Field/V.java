package autowired_Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("v")
public class V {
	@Autowired(required = true)
	private A ob;
	public void showV() {
		ob.showA();
	}

}
