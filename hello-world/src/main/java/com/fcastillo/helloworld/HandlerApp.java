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
 * @author Francisco Castillo
 */
public class HandlerApp implements RequestHandler<HandlerRequest, HandlerResponse> {

    @Override
    public HandlerResponse handleRequest(HandlerRequest request, Context ctx) {
        String requestName = request.getName();
        ctx.getLogger().log("Hola " + requestName);
        return new HandlerResponse("Hola " + requestName);
    }

}
