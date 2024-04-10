import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;



public class App 
{
    
	public static void main( String[] args )
    {
		
     BeanFactory scc=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
     C cs =(C) scc.getBean("xyz");
     cs.show();
	 
    }
}