package br.com.projeto.exemplo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo01.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
