package com.example.demo;

import java.util.Date;
import javax.validation.constraints.Pattern;

record LoginCredential3(

    @Pattern(message="max 50 letters please" , regexp="^[a-zA-Z]{1,50}$")
    String access,

    @Pattern(message="max 50 numbers please" , regexp="^[0-9]{1,10}$")
    String number,

    @Pattern(message="max 50 letters please" , regexp="^[a-zA-Z0_ ]*$")
    String nameHotel){}

