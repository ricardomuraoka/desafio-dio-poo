package com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {

    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
