package br.com.dominio.desafioopaitconsulting.Repositories;

import br.com.dominio.desafioopaitconsulting.Model.DesafioModelVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<DesafioModelVehicle, Long> {
}
