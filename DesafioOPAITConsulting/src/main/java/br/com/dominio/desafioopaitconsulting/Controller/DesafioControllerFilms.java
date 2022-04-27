package br.com.dominio.desafioopaitconsulting.Controller;

import br.com.dominio.desafioopaitconsulting.Model.DesafioModelFilms;
import br.com.dominio.desafioopaitconsulting.Model.DesafioModelVehicle;
import br.com.dominio.desafioopaitconsulting.Repositories.FilmsRepository;
import br.com.dominio.desafioopaitconsulting.Repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class DesafioControllerFilms {

    @Autowired
    private FilmsRepository filmsRepository;

    @PostMapping(path ="/gravar" )
    public void gravar(@RequestBody DesafioModelFilms desafioModelFilms){
        String uri = "https://swapi.dev";
        RestTemplate restTemplate = new RestTemplate();
        desafioModelFilms = restTemplate.getForObject(uri,DesafioModelFilms.class);
        filmsRepository.save(desafioModelFilms);
    }

    @GetMapping(path="/listar")
    public List<DesafioModelFilms> listar(){
        return filmsRepository.findAll();
    }

}
