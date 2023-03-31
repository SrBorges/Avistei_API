package com.company.api.animal;

import jakarta.validation.constraints.NotNull;

public record AnimalDTO(@NotNull Long id,
                        String nome,
                        String cuidados,
                        Perigolvl perigolvl,
                        String esconderijo,
                        String textomedico) {

    public AnimalDTO(AnimalEntity json){

        this(json.getId(),
                json.getNome(),
                json.getCuidados(),
                json.getPerigolvl(),
                json.getEsconderijo(),
                json.getTextomedico());
    }

}
