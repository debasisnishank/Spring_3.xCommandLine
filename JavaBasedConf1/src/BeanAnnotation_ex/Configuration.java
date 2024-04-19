package BeanAnnotation_ex;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
@Bean("dao1")
public DaoImpl1 getDao1() {
	return new DaoImpl1();
}
@Bean
public DaoImpl2 getDao2() {
	return new DaoImpl2();
}
}
