package com.github.mrlmarlon.wrapper;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class IEWrapper {

    private String inscricao_estadual;
    private boolean ativo;
    private EstadoWrapper estado;
}
