package br.com.projeto.exemplo03.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter
@Setter
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  @JsonBackReference
  @ManyToMany
  @JoinTable(name = "students_courses", joinColumns = {
      @JoinColumn(name = "id_student", referencedColumnName = "id") }, inverseJoinColumns = {
          @JoinColumn(name = "id_course", referencedColumnName = "id") })
  private List<Course> courses;
}
