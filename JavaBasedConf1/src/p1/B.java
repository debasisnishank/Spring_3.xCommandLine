package p1;

import org.springframework.stereotype.Component;

@Component
public class B {
    String ob;
    public B(){
        System.out.println("B object created");
        ob = "Susa";
    }
    public void show(){
        System.out.println("B object show method");
    }
}