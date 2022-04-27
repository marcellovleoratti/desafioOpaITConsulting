package br.com.dominio.desafioopaitconsulting.Model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="funcionarios")
@Getter
@Setter
@Data
@EqualsAndHashCode
@ToString
public class DesafioModelVehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;
    private String name;
    private String model;
    private String manufacturer;
    private String cost_in_credits;
    private double length;
    private Integer max_atmosphering_speed;
    private Integer crew;
    private Integer passengers;
    private Integer cargo_capacity;
    private String consumables;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="id")
    private List<DesafioModelFilms> films;

}
