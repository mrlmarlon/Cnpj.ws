package com.github.mrlmarlon.ws;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import com.github.mrlmarlon.wrapper.RetornoWrapper;

public interface CnpjWS {

    @RequestLine("GET /cnpj/{cnpj}")
    String consulta(@Param("cnpj") String cnpj);

    @RequestLine("GET /cnpj/{cnpj}")
    @Headers("x_api_token: {token}")
    String consulta(@Param("cnpj") String cnpj, @Param("token") String token);

    @RequestLine("GET /cnpj/{cnpj}")
    @Headers("x_api_token: {token}")
    RetornoWrapper consultaWrapper(@Param("cnpj") String cnpj);

    @RequestLine("GET /cnpj/{cnpj}")
    @Headers("x_api_token: {token}")
    RetornoWrapper consultaWrapper(@Param("cnpj") String cnpj, @Param("token") String token);

}