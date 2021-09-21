package retobcp.reto.domain.repository;

import retobcp.reto.domain.TypeChange;
import retobcp.reto.domain.TypeChangeReto;

import java.util.List;

public interface TypeChangeRepository {
    List<TypeChange> getAll();
    TypeChange postCambio(TypeChangeReto reto);
    TypeChangeReto postCambioReto(TypeChangeReto reto);
}
