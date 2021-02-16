package one.digitalInnovation.beerstock_api.mapper;

import one.digitalInnovation.beerstock_api.dto.BeerDTO;
import one.digitalInnovation.beerstock_api.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
