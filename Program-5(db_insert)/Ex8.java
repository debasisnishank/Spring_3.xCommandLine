import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Ex8 {
	public static void main(String[] args) {
     ApplicationContext	scc=(ApplicationContext)new ClassPathXmlApplicationContext("applicationContext.xml");
     EmployeeDaoImp e=( EmployeeDaoImp)scc.getBean("employee");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the employee  id : ");
     int id=sc.nextInt();
     System.out.println("Enter Employee  Name");
     String name=sc.next();
     int a=e.insertRecord(id,name);
     if(a==1)
     System.out.println("RECORD INSERTED  SUCCESSFULLY");
			}
}

