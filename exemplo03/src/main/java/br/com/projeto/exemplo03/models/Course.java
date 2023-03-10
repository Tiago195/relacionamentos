package br.com.projeto.exemplo03.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

// import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "courses")
@Getter
@Setter
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  @ManyToMany(mappedBy = "courses")
  private List<Student> students;
}
