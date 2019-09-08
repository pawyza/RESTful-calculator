package com.mycompany.lista13.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CalculateImpl implements Calculate {

    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double subtract(double x, double y) {
        return x-y;
    }

    @Override
    public double multiply(double x, double y) {
        return x*y;        
    }

    @Override
    public double divide(double x, double y) {
        return x/y;
    }
    
}
