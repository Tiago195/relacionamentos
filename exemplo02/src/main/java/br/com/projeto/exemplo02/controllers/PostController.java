package br.com.projeto.exemplo02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo02.repositories.PostRepository;
import br.com.projeto.exemplo02.models.Post;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

  @Autowired
  PostRepository postRepository;

  @GetMapping
  public ResponseEntity<List<Post>> getAll() {
    return ResponseEntity.status(HttpStatus.OK).body(postRepository.findAll());
  }

  @PostMapping
  public ResponseEntity<Post> create(@RequestBody Post post) {
    return ResponseEntity.status(HttpStatus.CREATED).body(postRepository.save(post));
  }
}
