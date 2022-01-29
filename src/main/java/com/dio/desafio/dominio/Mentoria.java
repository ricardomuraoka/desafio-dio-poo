package com.dio.desafio.dominio;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria() {

    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
