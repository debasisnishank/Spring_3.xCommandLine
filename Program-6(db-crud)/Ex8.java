import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex8 {
     public static void main(String[] args) {
          ApplicationContext scc = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");
          EmployeeDaoImp e = (EmployeeDaoImp) scc.getBean("employee");
          System.out.println("1.INSERTION"+"\n 2.DELETION" +"\n 3.VIEW RECORD" +"\n 4.UPDATE RECORD");
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Number  of operation you want to perform: ");
          int n = sc.nextInt();
          switch (n) {
               case 1:System.out.println("Entering into Insertion mode....");
                    System.out.println("Enter the employee  id : ");
                    int id = sc.nextInt();
                    System.out.println("Enter Employee  Name");
                    String name = sc.next();
                    int a = e.insertRecord(id, name);
                    if (a == 1)
                         System.out.println("RECORD INSERTED  SUCCESSFULLY");
                    break;

               case 2:
                    System.out.println("entering into deletion mode.....");
                    System.out.println("Enter the employee  id to delete that record: ");
                    int id1 = sc.nextInt();
                    int b = e.deleteRecord(id1);
                    if (b > 0)
                         System.out.println("RECORD DELETED SUCCESSFULLY");
                         break;
               case 3:
                System.out.println("Displaying records...");
                e.showRecord();
                break;
                case 4:
                System.out.println("Entered into Updating  era..");
                System.out.println("Enter the id  for which data is to be updated");
                int id2 =sc.nextInt();
                System.out.println("Enter the Value  by which we have to update the data");
                String val = sc.next();
                int vals = e.updateEmployeeDetails(id2,val);
                 if(vals >0)
                 System.out.println("Data Updated Successfully");
                 break;
          
                default:System.out.println("INVALID OPEARTION");
          }
          System.out.println("PROGRAM EXECUTED SUCCESSFULLY");
     }
}
