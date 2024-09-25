package utez.edu.mx.myApi.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pet")
//@CrossOrigin(origins = {*})
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping("") //Listar todos los elementos
    public ResponseEntity<?> findAll() {
        return petService.findAll();
    }

    @GetMapping("/{id}") // Listar un elemento específico
    public ResponseEntity<?> findById(@PathVariable long id) {
        return petService.findById(id);
    }
}
