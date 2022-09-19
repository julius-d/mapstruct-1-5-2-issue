package org.example.mapstruct152issue;

import static org.junit.jupiter.api.Assertions.*;

import org.example.mapstruct152issue.domain.Animal;
import org.example.mapstruct152issue.domain.Food.FoodType;
import org.junit.jupiter.api.Test;

class AnimalMapperTest {

  private final AnimalMapper animalMapper = new AnimalMapperImpl();

  @Test
  void mapsToDto() {
    Animal animal = Animal.builder()
        .name("Jon")
        .foodType(FoodType.FOO)
        .build();

    AnimalDto animalDto = animalMapper.map(animal);

    AnimalDto expected = new AnimalDto();
    expected.setName("Jon");
    expected.setFoodType("FOO");
    assertEquals(animalDto, expected);
  }

  @Test
  void mapsFromDto() {
    AnimalDto dto = new AnimalDto();
    dto.setName("Jon");
    dto.setFoodType("FOO");

    Animal animal = animalMapper.map(dto);

    Animal expected = Animal.builder()
        .name("Jon")
        .foodType(FoodType.FOO)
        .build();

    assertEquals(animal, expected);
  }


}
