package br.com.fruits.controller;

import br.com.fruits.model.Fruit;
import br.com.fruits.service.FruitService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FruitsApiController {

  private final FruitService service;

  @GetMapping("/fruits")
  public List<Fruit> getAll() {
    return service.findAll();
  }

}
