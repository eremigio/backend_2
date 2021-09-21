package retobcp.reto.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import retobcp.reto.domain.TypeChange;
import retobcp.reto.domain.TypeChangeReto;
import retobcp.reto.domain.service.TypeChangeService;

import java.util.List;


@RestController
@RequestMapping("/typechange")


public class TypeChangeController {
    @Autowired
    private TypeChangeService changeService;
    @GetMapping("/all")
    public List<TypeChange> getAll(){
        return changeService.getAll();
    }
    @PostMapping("/cambio")
    public TypeChange postCambio(TypeChangeReto reto){
        return changeService.postCambio(reto);
    }
    @PostMapping("/cambioreto")
    public TypeChangeReto postCambioReto(TypeChangeReto reto){
        return changeService.postCambioReto(reto);
    }
}
