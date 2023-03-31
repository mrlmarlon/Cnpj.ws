package com.github.mrlmarlon.wrapper;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class RetornoWrapper {

    private String cnpj_raiz;
    private String razao_social;
    private Double capital_social;
    private String responsavel_federativo;
    private Date atualizado_em;

    private EstabelecimentoWrapper estabelecimento;

}