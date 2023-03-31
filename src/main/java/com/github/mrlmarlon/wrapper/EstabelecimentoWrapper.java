package com.github.mrlmarlon.wrapper;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class EstabelecimentoWrapper {
    private String cnpj;
    private String nome_fantasia;
    private String tipo_logradouro;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String ddd1;
    private String telefone1;
    private String ddd2;
    private String telefone2;
    private String email;
    private Date data_inicio_atividade;


    private CidadeWrapper cidade;
    private EstadoWrapper estado;
    private List<SocioWrapper> socios;
    private List<IEWrapper> inscricoes_estaduais;
}
