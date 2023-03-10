package br.com.projeto.exemplo01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo01.repositories.CollaboratorRepository;

import java.util.List;
import br.com.projeto.exemplo01.models.Collaborator;

@RestController
@RequestMapping("/collaborators")
public class CollaboratorController {

  @Autowired
  CollaboratorRepository collaboratorRepository;

  @GetMapping
  public ResponseEntity<List<Collaborator>> getAll() {
    return ResponseEntity.status(HttpStatus.OK).body(collaboratorRepository.findAll());
  }

  @PostMapping
  public ResponseEntity<Object> createCollaborator(@RequestBody Collaborator collaborator) {
    return ResponseEntity.status(HttpStatus.CREATED).body(collaboratorRepository.save(collaborator));
  }
}
