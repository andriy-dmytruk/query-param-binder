package com.example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = Micronaut.run(Application.class, args);

        Api api = ctx.getBean(Api.class);
        api.customQuery("Andriy");
    }
}
