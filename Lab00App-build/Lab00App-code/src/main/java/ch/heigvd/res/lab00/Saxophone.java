/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author migue
 */
public class Saxophone extends IInstrument{
    public Saxophone(){
        sound = "fuuu";
    }
    
    @Override
    String play(){
        return sound;
    }
}
