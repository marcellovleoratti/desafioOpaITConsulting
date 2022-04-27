package br.com.dominio.desafioopaitconsulting.Model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="Films")
@Getter
@Setter
@Data
@EqualsAndHashCode
@ToString
public class DesafioModelFilms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;
    private String title;
    private Long episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private LocalDate release_date;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="id")
    private List<DesafioModelVehicle> vehicles;

}
