/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author Nick_
 */
public abstract class Observer {
    
    protected EshopChannel channel;
    protected abstract void update(String message);
    
}