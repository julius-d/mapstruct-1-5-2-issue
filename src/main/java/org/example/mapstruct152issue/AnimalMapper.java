package org.example.mapstruct152issue;

import static org.mapstruct.ReportingPolicy.ERROR;

import org.example.mapstruct152issue.domain.Animal;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ERROR, typeConversionPolicy = ERROR)
public interface AnimalMapper {

  AnimalDto map(Animal animal);
  Animal map(AnimalDto animal);

}
