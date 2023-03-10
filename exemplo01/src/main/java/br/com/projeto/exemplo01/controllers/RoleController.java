package br.com.projeto.exemplo01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import br.com.projeto.exemplo01.models.Role;

import br.com.projeto.exemplo01.repositories.RoleRepository;

@RestController
@RequestMapping("/roles")
public class RoleController {

  @Autowired
  RoleRepository roleRepository;

  @GetMapping
  public ResponseEntity<List<Role>> getRoles() {
    return ResponseEntity.status(HttpStatus.OK).body(roleRepository.findAll());
  }

  @PostMapping
  public ResponseEntity<Object> createRole(@RequestBody Role role) {
    return ResponseEntity.status(HttpStatus.CREATED).body(roleRepository.save(role));
  }

}
