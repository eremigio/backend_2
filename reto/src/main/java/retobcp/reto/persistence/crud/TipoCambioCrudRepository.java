package retobcp.reto.persistence.crud;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import retobcp.reto.persistence.entity.TipoCambio;

public interface TipoCambioCrudRepository extends CrudRepository<TipoCambio,Integer> {
    @Query(value = "select * from tipocambio where id= ?1",nativeQuery = true)
    TipoCambio postCambio(Integer reto);

    @Query(value = "select * from tipocambio where id= ?1",nativeQuery = true)
    TipoCambio postCambioReto(Integer reto);
}
