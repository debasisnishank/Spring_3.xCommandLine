
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
class A {
    String name;
    A(String ob){
        name=ob;
    }
    public void show(){
        System.out.println(name);
    }
}
class Test{
    public static void main(String[] args) {
        ApplicationContext scc = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");
        A ob = (A) scc.getBean("ds1");
        System.out.println(ob);
        A ob1 = (A) scc.getBean("ds1");
        System.out.println(ob1);
    }
}