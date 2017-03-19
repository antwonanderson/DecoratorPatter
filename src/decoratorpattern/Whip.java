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
public class Whip extends CondimentDecorator {
    
    Beverage beverage;
    
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    
    public double cost() {
        return .20 + beverage.cost();
    }
}
