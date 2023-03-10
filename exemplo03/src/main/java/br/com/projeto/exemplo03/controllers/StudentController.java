package br.com.projeto.exemplo03.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo03.models.Student;
import br.com.projeto.exemplo03.repositories.StudentRepository;

@RestController
@RequestMapping("students")
public class StudentController {

  @Autowired
  StudentRepository studentRepository;

  @GetMapping
  public ResponseEntity<List<Student>> getAll() {
    return ResponseEntity.status(HttpStatus.OK).body(studentRepository.findAll());
  }

  @PostMapping
  public ResponseEntity<Student> create(@RequestBody Student student) {
    return ResponseEntity.status(HttpStatus.CREATED).body(studentRepository.save(student));
  }
}
