package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("xyz")
public class X{
  private Z cd;

  @Autowired
  public X(Z cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }
//  public void play() {
//	  System.out.println("Inside the X");
//  }

}

