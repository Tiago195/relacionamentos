package br.com.projeto.exemplo02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.projeto.exemplo02.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
