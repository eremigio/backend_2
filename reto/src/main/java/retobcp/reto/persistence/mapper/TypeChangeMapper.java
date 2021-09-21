package retobcp.reto.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import retobcp.reto.domain.TypeChange;
import retobcp.reto.persistence.entity.TipoCambio;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeChangeMapper {

    @Mappings(
            {
                    @Mapping(source = "id",target = "id"),
                    @Mapping(source = "tipo",target = "type"),
                    @Mapping(source = "estado",target = "state"),
                    @Mapping(source = "valor",target = "valuesdoble")

            }
    )
    TypeChange toTypeChange(TipoCambio client);

    @InheritInverseConfiguration
    TipoCambio toTipoCambio(TypeChange client);
    List<TypeChange> toTypeChanges(List<TipoCambio> tipos);
}
