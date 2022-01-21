package recruitment.hashapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IsItWorking {

  @GetMapping("/isItWorking")
  public String isItWorking() {
    return "I am working.";
  }
}
