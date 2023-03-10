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

import br.com.projeto.exemplo03.models.Course;
import br.com.projeto.exemplo03.repositories.CourseRepository;

@RestController
@RequestMapping("courses")
public class CourseController {

  @Autowired
  CourseRepository courseRepository;

  @GetMapping
  public ResponseEntity<List<Course>> getAll() {
    return ResponseEntity.status(HttpStatus.OK).body(courseRepository.findAll());
  }

  @PostMapping
  public ResponseEntity<Course> create(@RequestBody Course course) {
    return ResponseEntity.status(HttpStatus.CREATED).body(courseRepository.save(course));
  }

}
