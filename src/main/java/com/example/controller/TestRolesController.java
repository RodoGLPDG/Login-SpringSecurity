package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Aqui se restringue

@RestController
public class TestRolesController {



    @GetMapping("/accessUser")
    @PreAuthorize("hasRole('USER')")
    public String accessUser(){
        return "Hola, has accedito con rol de USER";
    }

    @GetMapping("/accessInvited")
    @PreAuthorize("hasRole('INVITED')")
    public String accessInvited(){
        return "Hola, has accedito con rol de INVITED";
    }
}