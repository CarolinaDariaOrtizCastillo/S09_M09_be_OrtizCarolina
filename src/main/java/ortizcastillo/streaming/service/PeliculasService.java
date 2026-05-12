package ortizcastillo.streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import ortizcastillo.streaming.repository.PeliculasRepository;
import ortizcastillo.streaming.model.Peliculas;

@Service
public class PeliculasService {

    @Autowired
    private PeliculasRepository repo;

    public List<Peliculas> listar() {
        return repo.findAll();
    }

    public Peliculas guardar(Peliculas p) {
        return repo.save(p);
    }

    public Peliculas actualizar(int id, Peliculas p) {
        p.setId(id);
        return repo.save(p);
    }

    public void eliminar(int id) {
        repo.deleteById(id);
    }
}