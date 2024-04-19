package bean_priority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pqr")
public class C {
	 @Autowired
	    @Qualifier("a")	
private Dao dao;
   
//	public void setDao(Dao d) {
//		dao = d;
//	}
	public void play() {
		dao.play();
	}
}
