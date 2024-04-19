package value_read_from_properties_file;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/value_read_from_properties_file/myapp.properties")
public class Confi {
	@Autowired
    Environment   env ;
     
     @Bean("emp")
    public Employee getEmployee()
        {
    	   return new Employee(env.getProperty("e.name"),env.getProperty("e.addr"));
  
        }
     

}
