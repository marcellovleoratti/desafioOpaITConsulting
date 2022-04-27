package br.com.dominio.desafioopaitconsulting.Controller;


import br.com.dominio.desafioopaitconsulting.Model.DesafioModelVehicle;
import br.com.dominio.desafioopaitconsulting.Repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(path="/swapi/Vehicle")
public class DesafioControllerVehicle {

    @Autowired
    private VehicleRepository vehicleRepository;

    @PostMapping(path ="/gravar" )
    public void gravar(@RequestBody DesafioModelVehicle desafioModelVehicle){
        String uri = "https://swapi.dev";
        RestTemplate restTemplate = new RestTemplate();
        desafioModelVehicle = restTemplate.getForObject(uri,DesafioModelVehicle.class);
        vehicleRepository.save(desafioModelVehicle);
    }

    @GetMapping(path="/listar")
    public List<DesafioModelVehicle> listar(){
        return vehicleRepository.findAll();
    }
}
