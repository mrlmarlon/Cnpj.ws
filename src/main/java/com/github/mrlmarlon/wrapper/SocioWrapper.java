package com.github.mrlmarlon.wrapper;

import lombok.Data;

import java.util.Date;

@Data
public class SocioWrapper {

    private String cpf_cnpj_socio;
    private String nome;
    private String tipo;
    private Date data_entrada;
    private String cpf_representante_legal;
    private String nome_representante;
    private Date atualizado_em;
    private String pais_id;
}
