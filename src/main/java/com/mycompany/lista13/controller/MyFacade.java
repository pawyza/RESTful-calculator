/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista13.controller;

import com.mycompany.lista13.service.Calculate;
import com.mycompany.lista13.service.CalculateImpl;
import javax.inject.Inject;

/**
 *
 * @author User
 */
public class MyFacade {
    
    @Inject
    private Calculate calculate;
    
    public double add(double x,double y){
        return calculate.add(x, y);
    }
    
    public double subtract(double x,double y){
        return calculate.subtract(x, y);
    }
        
    public double multiply(double x,double y){
        return calculate.multiply(x, y);
    }
            
    public double divide(double x,double y){
        return calculate.divide(x, y);
    }
}
