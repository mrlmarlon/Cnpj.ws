package com.github.mrlmarlon.util;

import com.github.mrlmarlon.wrapper.RetornoWrapper;
import com.github.mrlmarlon.ws.CnpjWS;
import com.google.common.base.CharMatcher;
import com.google.gson.GsonBuilder;
import feign.Feign;
import feign.gson.GsonDecoder;

public class ConsultaCnpj {

    private static final String CNPJ_WS_URL = "https://comercial.cnpj.ws";
    private static final String DEFAULT_CNPJ = "00000000000000";

    public static RetornoWrapper consultaCnpj(String cnpj) {
        return consultaCnpj(
                new GsonDecoder(
                        new GsonBuilder()
                                .setDateFormat("dd/MM/yyyy")
                                .create())
                , cnpj);
    }

    public static RetornoWrapper consultaCnpj(String cnpj, String token) {
        return consultaCnpj(
                new GsonDecoder(
                        new GsonBuilder()
                                .setDateFormat("dd/MM/yyyy")
                                .create())
                , cnpj, token);
    }

    public static RetornoWrapper consultaCnpj(GsonDecoder decoder, String cnpj) {
        return Feign
                .builder()
                .decoder(decoder)
                .target(CnpjWS.class, CNPJ_WS_URL)
                .consultaWrapper(retainDigits(cnpj));
    }

    public static RetornoWrapper consultaCnpj(GsonDecoder decoder, String cnpj, String token) {
        return Feign
                .builder()
                .decoder(decoder)
                .target(CnpjWS.class, CNPJ_WS_URL)
                .consultaWrapper(retainDigits(cnpj), token);
    }

    public static String consultaData(String cnpj) {
        return Feign
                .builder()
                .target(CnpjWS.class, CNPJ_WS_URL)
                .consulta(retainDigits(cnpj));
    }

    public static String consultaData(String cnpj, String token) {
        return Feign
                .builder()
                .target(CnpjWS.class, CNPJ_WS_URL)
                .consulta(retainDigits(cnpj), token);
    }

    private static String retainDigits(String cnpj) {
        final String digits = CharMatcher.digit().retainFrom(cnpj);

        if (digits.length() != 14) {
            return DEFAULT_CNPJ;
        }

        return digits;
    }
}
