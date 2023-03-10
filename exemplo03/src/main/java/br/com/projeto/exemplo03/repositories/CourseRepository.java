package br.com.projeto.exemplo03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo03.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
