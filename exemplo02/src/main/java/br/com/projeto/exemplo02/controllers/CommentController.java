package br.com.projeto.exemplo02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo02.repositories.CommentRepository;

import java.util.List;
import br.com.projeto.exemplo02.models.Comment;

@RestController
@RequestMapping("/comments")
public class CommentController {

  @Autowired
  CommentRepository commentRepository;

  @GetMapping
  public ResponseEntity<List<Comment>> getAll() {
    return ResponseEntity.status(HttpStatus.OK).body(commentRepository.findAll());
  }

  @PostMapping
  public ResponseEntity<Comment> create(@RequestBody Comment comment) {
    return ResponseEntity.status(HttpStatus.CREATED).body(commentRepository.save(comment));
  }
}
