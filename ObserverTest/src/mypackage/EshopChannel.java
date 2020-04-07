/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nick_
 */
public class EshopChannel {
    
    private List<Observer> rawFruits;
    private String name;
    
    
    public EshopChannel(String fruit) {
        this.name = name;
        rawFruits= new ArrayList();
    }
    
    public List<Observer> getcustomers() {
        return rawFruits;
    }

    public String getRawFruit() {
        return name;
    }

    public void setRawFruit(String rawFruit) {
        this.name = rawFruit;
         String message = "A new Raw fruit is about to come to the shop " + this.name;
    }
    
    
    
  
    
}
