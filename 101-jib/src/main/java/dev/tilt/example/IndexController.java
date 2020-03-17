package dev.tilt.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

  @GetMapping("/")
  public String index(Model model) {
    // Serves the index.html template under
    // src/main/resources/templates/index.html
    return "index";
  }

}
