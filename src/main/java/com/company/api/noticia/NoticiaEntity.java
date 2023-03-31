package com.company.api.noticia;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "noticia")
@Entity(name = "NoticiaEntity")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


public class NoticiaEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotNull @NotBlank
    private String titulo;
    private String data;
    private String corpo;
    private String pchave;


    public NoticiaEntity(NoticiaEntity json) {

        this.titulo = json.titulo;
        this.data = json.data;
        this.corpo = json.corpo;
        this.pchave = json.pchave;

    }

    public void updateInfo(NotUpdateDTO json) {

        if(json.titulo() != null){
            this.titulo = json.titulo();
        }

        if(json.data() != null){
            this.data = json.data();
        }

        if(json.corpo() != null){
            this.corpo = json.corpo();
        }

        if(json.pchave() != null){
            this.pchave = json.pchave();
        }

    }
}
