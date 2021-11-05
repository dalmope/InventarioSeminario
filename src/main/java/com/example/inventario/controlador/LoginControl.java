package com.example.inventario.controlador;


import com.example.inventario.modelo.Login;
import com.example.inventario.servicios.LoginServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("login")
public class LoginControl {

    private final LoginServicio loginServicio;

    @Autowired
    public LoginControl (LoginServicio loginServicio){
        this.loginServicio = loginServicio;
    }

    @PostMapping
    public ResponseEntity <Object> login(@RequestBody Login login){
        ResponseEntity<Object> respuesta= new ResponseEntity<>(login, HttpStatus.OK);
        return respuesta;
    }
}

