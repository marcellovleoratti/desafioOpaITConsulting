package br.com.dominio.desafioopaitconsulting.Repositories;

import br.com.dominio.desafioopaitconsulting.Model.DesafioModelPeople;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeolpleRepository extends JpaRepository<DesafioModelPeople,Long> {
}
