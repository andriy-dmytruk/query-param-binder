package com.example;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

@Controller()
public class PetController {
    @Get("/person{?name}")
    public void customQuery(@Nullable @QueryValue String name) {
        System.out.println("Got query name " + String.valueOf(name));
    }
}
