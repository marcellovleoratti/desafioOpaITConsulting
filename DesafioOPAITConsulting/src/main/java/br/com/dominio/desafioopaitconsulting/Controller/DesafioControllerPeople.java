package br.com.dominio.desafioopaitconsulting.Controller;

import br.com.dominio.desafioopaitconsulting.Model.DesafioModelPeople;
import br.com.dominio.desafioopaitconsulting.Repositories.PeolpleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@RequestMapping(path="/swapi/people")
public class DesafioControllerPeople {

    @Autowired
    private PeolpleRepository peolpleRepository;

    @PostMapping(path ="/gravar" )
    public void gravar(@RequestBody DesafioModelPeople desafioModelPeople ){
        String uri = "https://swapi.dev";
        RestTemplate restTemplate = new RestTemplate();
        desafioModelPeople = restTemplate.getForObject(uri,DesafioModelPeople.class);
        peolpleRepository.save(desafioModelPeople);
    }

    @GetMapping(path="/listar")
    public List<DesafioModelPeople> listar(){
        return peolpleRepository.findAll();
    }
}
