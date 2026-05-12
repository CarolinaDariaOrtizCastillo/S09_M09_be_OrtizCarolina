package ortizcastillo.streaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ortizcastillo.streaming.service.PeliculasService;
import ortizcastillo.streaming.model.Peliculas;

import java.util.List;

@RestController
@RequestMapping("/peliculas")
@CrossOrigin(origins = "*") // 🔥 permite conexión con Angular
public class PeliculasController {

    @Autowired
    private PeliculasService service;

    @GetMapping
    public List<Peliculas> listar() {
        return service.listar();
    }

    @PostMapping
    public Peliculas guardar(@RequestBody Peliculas p) {
        return service.guardar(p);
    }

    @PutMapping("/{id}")
    public Peliculas actualizar(@PathVariable int id, @RequestBody Peliculas p) {
        return service.actualizar(id, p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}