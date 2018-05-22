/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.shellgame.models;

import java.math.BigDecimal;

/**
 *
 * @author apprentice
 */
public class Money {
    
    BigDecimal money = new BigDecimal(0);

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
    
    
}
