package br.com.fruits.service;

import br.com.fruits.model.Fruit;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;

@Service
public class FruitService {

  private static final String MIDDLE_SIZE = "Middle";

  public List<Fruit> findAll() {
    var apple = new Fruit("Apple", "Red", MIDDLE_SIZE);
    var banana = new Fruit("Banana", "Yellow", MIDDLE_SIZE);
    var grapes = new Fruit("Grapes", "Purple", "Small");
    var orange = new Fruit("Orange", "Orange", MIDDLE_SIZE);
    var mango = new Fruit("Mango", "Reddish", MIDDLE_SIZE);
    var watermelon = new Fruit("Watermelon", "Green", "Large");
    var pineapple = new Fruit("Pineapple", "Yellow", "Large");
    var strawberry = new Fruit("Strawberry", "Red", "Small");

    return Stream.of(apple, banana, grapes, orange, mango, watermelon, pineapple, strawberry)
        .sorted(Comparator.comparing(Fruit::getName))
        .toList();
  }

}
