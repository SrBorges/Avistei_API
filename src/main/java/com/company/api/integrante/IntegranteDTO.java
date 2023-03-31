package com.company.api.integrante;

import jakarta.validation.constraints.NotNull;

public record IntegranteDTO(@NotNull Long id,
                            String nome,
                            String emprego,
                            Stack stack,
                            String hobbies,
                            String foto) {

    public IntegranteDTO(IntegranteEntity json){

        this(json.getId(),
                json.getNome(),
                json.getEmprego(),
                json.getStack(),
                json.getHobbies(),
                json.getFoto());

    }

}
