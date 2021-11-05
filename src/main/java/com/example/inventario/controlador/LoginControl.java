package com.example.inventario.controlador;


import com.example.inventario.servicios.LoginServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginControl {

    private final LoginServicio loginServicio;

    @Autowired
    public LoginControl (LoginServicio loginServicio){
        this.loginServicio = loginServicio;
    }

}

