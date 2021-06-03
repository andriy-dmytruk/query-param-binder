package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@io.micronaut.http.client.annotation.Client("/")
public interface Api {
    @Get("/person")
    void customQuery(@NameQueryParam String name);
}
