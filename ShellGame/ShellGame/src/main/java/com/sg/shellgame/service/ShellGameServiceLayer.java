/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.shellgame.service;

import com.sg.shellgame.models.Shell;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class ShellGameServiceLayer {
    
    Random random = new Random();
    
    public List<Shell> getShells(){
        List<Shell> shells = new ArrayList<>();
        shells.clear();
        Shell shellOne = new Shell();
        shellOne.setShellNumber(1);
        Shell shellTwo = new Shell();
        shellTwo.setShellNumber(2);
        Shell shellThree = new Shell();
        shellThree.setShellNumber(3);
        
        int i = random.nextInt(3) + 1;
        if(i == 1){
            shellOne.setHasPebble(true);            
        }
        if(i== 2){
            shellTwo.setHasPebble(true);
        }
        if(i==3){
            shellThree.setHasPebble(true);
        }
        shells.add(shellOne);
        shells.add(shellTwo);
        shells.add(shellThree);        
        return shells;
    }    
    
}
