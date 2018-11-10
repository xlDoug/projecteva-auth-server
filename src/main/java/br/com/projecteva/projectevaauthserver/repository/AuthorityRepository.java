package br.com.projecteva.projectevaauthserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projecteva.projectevaauthserver.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

	Authority findByName(String name);

}