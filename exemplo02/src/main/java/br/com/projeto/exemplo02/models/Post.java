package br.com.projeto.exemplo02.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "posts")
@Getter
@Setter
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String title;

  private String text;

  @OneToMany
  @JoinColumn(name = "id_post")
  private List<Comment> comments;
}
