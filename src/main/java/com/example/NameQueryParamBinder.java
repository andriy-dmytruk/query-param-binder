package com.example;

import io.micronaut.core.annotation.AnnotationValue;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.convert.ArgumentConversionContext;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.client.bind.AnnotatedClientArgumentRequestBinder;
import io.micronaut.http.client.bind.ClientRequestUriContext;

import javax.inject.Singleton;
import javax.validation.constraints.NotNull;

@Singleton
public class NameQueryParamBinder implements AnnotatedClientArgumentRequestBinder<NameQueryParam> {
    @NotNull
    @Override
    public Class<NameQueryParam> getAnnotationType() {
        return NameQueryParam.class;
    }

    @Override
    public void bind(@NotNull ArgumentConversionContext<Object> context,
                     @NonNull ClientRequestUriContext uriContext,
                     @NotNull Object value,
                     @NotNull MutableHttpRequest<?> request
    ) {
        request.getParameters().add("name", value.toString());
    }
}