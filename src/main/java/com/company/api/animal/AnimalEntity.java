package com.company.api.animal;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "animal")
@Entity(name = "AnimalEntity")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class AnimalEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotNull @NotBlank
    private String nome;
    private String cuidados;
    @Enumerated(EnumType.STRING)
    private Perigolvl perigolvl;
    private String esconderijo;
    private String textomedico;


    public AnimalEntity(AnimalEntity json) {

        this.nome = json.nome;
        this.cuidados = json.cuidados;
        this.perigolvl = json.perigolvl;
        this.esconderijo = json.esconderijo;
        this.textomedico = json.textomedico;

    }

    public void updateInfo(AnimalUpdateDTO json) {

        if(json.nome() != null) {
            this.nome = json.nome();
        }

        if(json.cuidados() != null){
            this.cuidados = json.cuidados();
        }

        if(json.perigolvl() != null){
            this.perigolvl = json.perigolvl();
        }

        if(json.esconderijo() != null){
            this.esconderijo = json.esconderijo();
        }

        if(json.textomedico() != json.textomedico()){
            this.textomedico = json.textomedico();
        }

    }
}
