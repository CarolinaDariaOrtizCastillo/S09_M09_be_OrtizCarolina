package ortizcastillo.streaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ortizcastillo.streaming.model.Peliculas;


public interface PeliculasRepository extends JpaRepository<Peliculas, Integer> {
}