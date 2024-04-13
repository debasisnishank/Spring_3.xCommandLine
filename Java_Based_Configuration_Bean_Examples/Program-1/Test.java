
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test{
    public static void main(String[] abc)
        {
            try {
                ApplicationContext context = new AnnotationConfigApplicationContext(A.class); 
                System.out.println(context);
            } catch (Exception e) {
                // TODO: handle exception
            }

            //  System.out.println(context);
}
}

