package dev.tilt.example;

import java.time.Duration;
import java.time.Instant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
  private final long startTimeSecs = 1705376285;
  private final long startTimeNanos = 5347251;
  private final String updateDuration;

  public IndexController() {
    if (startTimeSecs == 0) {
      updateDuration = "N/A";
      return;
    }

    Instant now = Instant.now();
    Instant startInstant = Instant.ofEpochSecond(startTimeSecs, startTimeNanos);
    Duration updateDuration = Duration.between(startInstant, now);

    this.updateDuration = String.format("%.1f", updateDuration.toMillis() / 1000.0) + "s";
    System.out.printf("Deploy time: %s\n", this.updateDuration);
  }


  @GetMapping("/")
  public String index(Model model) {
    // Serves the index.html template under
    // src/main/resources/templates/index.html
    model.addAttribute("updateDuration", updateDuration);
    return "index";
  }

}
