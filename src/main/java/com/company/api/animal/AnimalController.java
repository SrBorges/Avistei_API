package com.company.api.animal;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController

@RequestMapping("/animal")

public class AnimalController {

    @Autowired
    private AnimalRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity create(@RequestBody @Valid AnimalEntity json, UriComponentsBuilder UriBuilder){

        var animal = repository.save(new AnimalEntity(json));

        var uri = UriBuilder.path("/animal/{id}").buildAndExpand(animal.getId()).toUri();

        return ResponseEntity.created(uri).body(new AnimalDTO(animal));

    }

    @GetMapping
    public Page<AnimalDTO> read(Pageable page){

        return repository.findAll(page).map(AnimalDTO::new);
    }

    @PutMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid AnimalUpdateDTO json){

        var animal = repository.getReferenceById(json.id());

        animal.updateInfo(json);

        return ResponseEntity.ok(new AnimalUpdateDTO(animal));

    }


    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id){

        repository.deleteById(id);

        return ResponseEntity.noContent().build();

    }

    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id){

        var animal = repository.getReferenceById(id);

        return ResponseEntity.ok(new AnimalDTO(animal));

    }

}
