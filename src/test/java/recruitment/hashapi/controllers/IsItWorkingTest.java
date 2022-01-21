package recruitment.hashapi.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IsItWorkingTest {

  @Autowired
  private TestRestTemplate template;

  @Test
  public void returnsProperAnswer() {
    ResponseEntity<String> response = template.getForEntity("/isItWorking", String.class);
    assertThat(response.getBody()).isEqualTo("I am working.");
  }
}
