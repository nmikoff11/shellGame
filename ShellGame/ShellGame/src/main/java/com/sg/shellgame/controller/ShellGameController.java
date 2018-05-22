/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.shellgame.controller;

import com.sg.shellgame.models.Shell;
import com.sg.shellgame.service.ShellGameServiceLayer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author apprentice
 */
@RestController
@RequestMapping("/api/shells")
public class ShellGameController {
    
    
    private static List<Shell> shells = new ArrayList<>();
    ShellGameServiceLayer service = new ShellGameServiceLayer();

    public ShellGameController() {
    }
    
    @GetMapping
    public List<Shell> getShells(){
        shells.clear();        
        shells = service.getShells();
        return shells;
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addShells(@RequestBody Shell shell){
        
    }
    
}
