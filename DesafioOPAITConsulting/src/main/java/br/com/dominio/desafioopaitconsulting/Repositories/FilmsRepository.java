package br.com.dominio.desafioopaitconsulting.Repositories;

import br.com.dominio.desafioopaitconsulting.Model.DesafioModelFilms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmsRepository extends JpaRepository<DesafioModelFilms,Long> {
}
