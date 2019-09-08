/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista13.configuration;

import com.mycompany.lista13.controller.MyFacade;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
    @Path("/calc")
public class CalculatorEndpoint {
    
    @Inject
    private MyFacade myFacade;
    
    @GET
    @Path("/{a}/{operation}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public double calculate(@PathParam("a") double a, @PathParam("b") double b,@PathParam("operation") String operation){
        if (operation.equals("a"))
            return myFacade.add(a, b);
        else if (operation.equals("s"))
            return myFacade.subtract(a, b);
        else if (operation.equals("m"))
            return myFacade.multiply(a, b);
        else if (operation.equals("d"))
            return myFacade.divide(a, b);
        return 0;
    }
/*
    @POST
    @Path("/{a}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String calculate(@PathParam("a") String operation){
        return operation;
    }*/
}
