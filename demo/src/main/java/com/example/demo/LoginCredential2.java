package com.example.demo;

import javax.validation.constraints.Pattern;


record LoginCredential2(

    @Pattern(message="max 50 letters please" , regexp="[a-z0-9]+@[a-z]+.[a-z]{2,3}")
    String user,

    @Pattern(message="min 10 letteres and max 50 letters please" , regexp="^[a-zA-Z-.0-9]{10,50}$")
    String password) {}

