/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.shellgame.models;

/**
 *
 * @author apprentice
 */
public class Shell {
    boolean hasPebble = false;
    int shellNumber = 0;

    public int getShellNumber() {
        return shellNumber;
    }

    public void setShellNumber(int shellNumber) {
        this.shellNumber = shellNumber;
    }

    public boolean isHasPebble() {
        return hasPebble;
    }

    public void setHasPebble(boolean hasPebble) {
        this.hasPebble = hasPebble;
    }
    
}
