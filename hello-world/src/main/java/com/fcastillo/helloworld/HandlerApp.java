/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.helloworld;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 *
 * @author fcastillo
 */
public class HandlerApp implements RequestHandler<Object, Object> {

  @Override
  public String handleRequest(Object i, Context cntxt) {
    System.out.println("Hello World");
    return null;
  }

}
