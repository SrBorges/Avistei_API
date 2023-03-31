package com.company.api.integrante;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "integrante")
@Entity(name = "IntegranteEntity")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class IntegranteEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotNull @NotBlank
    private String nome;
    private String emprego;
    @Enumerated(EnumType.STRING)
    private Stack stack;
    private String hobbies;
    private String foto;

    public IntegranteEntity(IntegranteEntity json) {

        this.nome = json.nome;
        this.emprego = json.emprego;
        this.stack = json.stack;
        this.hobbies = json.hobbies;
        this.foto = json.foto;

    }

    public void updateInfo(InterUpdateDTO json) {

        if(json.nome() != null){
            this.nome = json.nome();
        }

        if(json.emprego() != null){
            this.emprego = json.emprego();
        }

        if(json.stack() != null){
            this.stack = json.stack();
        }

        if(json.hobbies() != null){
            this.hobbies = json.hobbies();
        }

        if(json.foto() != null){
            this.foto = json.foto();
        }

    }
}
