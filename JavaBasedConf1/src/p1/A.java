package p1;

import org.springframework.stereotype.Component;
@Component
public class A {
    String ob;
    public A(){
        System.out.println("A object created");
        ob = "Deva";
    }
    public void show(){
        System.out.println("A object show method");
    }
}
