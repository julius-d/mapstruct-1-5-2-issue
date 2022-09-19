package org.example.mapstruct152issue.domain;

import lombok.Builder;
import lombok.Value;
import org.example.mapstruct152issue.domain.Food.FoodType;

@Builder
@Value
public class Animal {

  FoodType foodType;
  String name;

}
