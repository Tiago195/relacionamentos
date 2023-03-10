package br.com.projeto.exemplo02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo02.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
