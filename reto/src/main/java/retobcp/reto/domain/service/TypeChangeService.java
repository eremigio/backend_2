package retobcp.reto.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retobcp.reto.domain.TypeChange;
import retobcp.reto.domain.TypeChangeReto;
import retobcp.reto.domain.repository.TypeChangeRepository;

import java.util.List;

@Service
public class TypeChangeService {
    @Autowired
    private TypeChangeRepository typeChangeRepository;

    public List<TypeChange> getAll(){
        return typeChangeRepository.getAll();
    }
    public TypeChange postCambio(TypeChangeReto reto){
        return typeChangeRepository.postCambio(reto);
    }
    public TypeChangeReto postCambioReto(TypeChangeReto reto){
        return typeChangeRepository.postCambioReto(reto);
    }
}
