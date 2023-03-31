package com.github.mrlmarlon;

import com.github.mrlmarlon.util.ConsultaCnpj;
import com.github.mrlmarlon.wrapper.RetornoWrapper;

public class Demo {

    private static final String EXTINTORWEB_CNPJ = "32972213000171";
    private static final String EXTINTORWEB_TOKEN = "xxxxxxxxxxxx";

    public static void main(String[] args) {
        System.out.println(ConsultaCnpj.consultaData(EXTINTORWEB_CNPJ, EXTINTORWEB_TOKEN));

        RetornoWrapper wp = ConsultaCnpj.consultaCnpj(EXTINTORWEB_CNPJ, EXTINTORWEB_TOKEN);
        System.out.println(wp.getCnpj_raiz());
        System.out.println(wp.getRazao_social());

        
    }
}
