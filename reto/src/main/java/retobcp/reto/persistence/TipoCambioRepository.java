package retobcp.reto.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import retobcp.reto.domain.TypeChange;
import retobcp.reto.domain.TypeChangeReto;
import retobcp.reto.domain.repository.TypeChangeRepository;
import retobcp.reto.persistence.crud.TipoCambioCrudRepository;
import retobcp.reto.persistence.entity.TipoCambio;
import retobcp.reto.persistence.mapper.TypeChangeMapper;

import java.util.List;

@Repository
public class TipoCambioRepository implements TypeChangeRepository {
    @Autowired
    private TipoCambioCrudRepository tipoCambioCrudRepository;
    @Autowired
    private TypeChangeMapper mapper;

    public List<TypeChange> getAll(){
        List<TipoCambio> tipoCambioList = (List<TipoCambio>)tipoCambioCrudRepository.findAll();
        return mapper.toTypeChanges(tipoCambioList);
    }

    public TypeChange postCambio(TypeChangeReto reto){
        TipoCambio typeChange =  tipoCambioCrudRepository.postCambio(reto.getOrigen());
        return mapper.toTypeChange(typeChange);
    }
    public TypeChangeReto postCambioReto(TypeChangeReto reto){
        TipoCambio tipo  = tipoCambioCrudRepository.postCambioReto(reto.getOrigen());
        TypeChangeReto typeChange = new TypeChangeReto();
        typeChange.setTipoOrigen(tipo.getTipo());
        typeChange.setDestino(reto.getDestino());
        typeChange.setMontoOrigen(tipo.getValor());
        typeChange.setMonto(reto.getMonto());
        TypeChangeReto type = this.obtenerDatosDestino(typeChange);
        return type;
    }
    public TypeChangeReto obtenerDatosDestino(TypeChangeReto reto){
        TipoCambio tipo  = tipoCambioCrudRepository.postCambioReto(reto.getDestino());
        reto.setTipoDestino(tipo.getTipo());
        reto.setTipoCambioDestino(tipo.getValor());
        Double totalMostrar = ( reto.getMontoOrigen() / tipo.getValor() ) * reto.getMonto();
        reto.setMontoDestino(totalMostrar);
        reto.setDestino(null);
        return reto;
    }
}
