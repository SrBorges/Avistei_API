package com.company.api.integrante;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController

@RequestMapping("/integrante")

public class IntegranteController {

    @Autowired
    private IntegranteRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity create(@RequestBody @Valid IntegranteEntity json, UriComponentsBuilder UriBuilder){

        var integrante = repository.save(new IntegranteEntity(json));

        var uri = UriBuilder.path("/integrante/{id}").buildAndExpand(integrante.getId()).toUri();

        return ResponseEntity.created(uri).body(new IntegranteDTO(integrante));

    }

    @GetMapping
    public Page<IntegranteDTO> read(Pageable page){

        return repository.findAll(page).map(IntegranteDTO::new);

    }

    @PutMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid InterUpdateDTO json){

        var integrante = repository.getReferenceById(json.id());

        integrante.updateInfo(json);

        return ResponseEntity.ok(new InterUpdateDTO(integrante));


    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id){

        repository.deleteById(id);

        return ResponseEntity.noContent().build();

    }

    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id){

        var integrante = repository.getReferenceById(id);

        return ResponseEntity.ok(new IntegranteDTO(integrante));

    }

}
