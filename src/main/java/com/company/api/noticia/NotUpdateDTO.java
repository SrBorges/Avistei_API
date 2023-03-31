package com.company.api.noticia;

import jakarta.validation.constraints.NotNull;

public record NotUpdateDTO(@NotNull Long id,
                           String titulo,
                           String data,
                           String corpo,
                           String pchave) {

    public NotUpdateDTO(NoticiaEntity json){

        this(json.getId(), json.getTitulo(), json.getData(), json.getCorpo(), json.getPchave());

    }

}
