package com.company.api.animal;

import jakarta.validation.constraints.NotNull;

public record AnimalUpdateDTO(@NotNull Long id,
                              String nome,
                              String cuidados,
                              Perigolvl perigolvl,
                              String esconderijo,
                              String textomedico
                              ) {

    public AnimalUpdateDTO(AnimalEntity json){

        this(json.getId(),
                json.getNome(),
                json.getCuidados(),
                json.getPerigolvl(),
                json.getEsconderijo(),
                json.getTextomedico());

    }



}
