/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

/**
 *
 * @author antwonanderson
 */
public class HouseBlend extends Beverage {
    
    public HouseBlend(){
        description = "Expresso";
    }
    
    @Override
    public double cost() {
        return .89;
    }
}
