package com.company.api.noticia;

import com.company.api.integrante.InterUpdateDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController

@RequestMapping("/noticia")

public class NoticiaController {

    @Autowired
    private NoticiaRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity create(@RequestBody @Valid NoticiaEntity json, UriComponentsBuilder UriBuilder){

        var noticia = repository.save(new NoticiaEntity(json));

        var uri = UriBuilder.path("/noticia/{id}").buildAndExpand(noticia.getId()).toUri();

        return ResponseEntity.created(uri).body(new NoticiaDTO(noticia));

    }

    @GetMapping
    public Page<NoticiaDTO> read(Pageable page){

        return repository.findAll(page).map(NoticiaDTO::new);

    }

    @PutMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid NotUpdateDTO json){

        var noticia = repository.getReferenceById(json.id());

        noticia.updateInfo(json);

        return ResponseEntity.ok(new NotUpdateDTO(noticia));

    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id){

        repository.deleteById(id);

        return ResponseEntity.noContent().build();

    }

    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id){

        var noticia = repository.getReferenceById(id);

        return ResponseEntity.ok(new NoticiaDTO(noticia));

    }



}
