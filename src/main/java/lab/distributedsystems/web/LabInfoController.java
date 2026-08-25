package lab.distributedsystems.web;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lab")
public class LabInfoController {

	@GetMapping
	public Map<String, Object> info() {
		return Map.of(
				"name", "distributed-systems-lab",
				"purpose", "Hands-on distributed systems and system design",
				"nextTopic", "consistent-hashing",
				"roadmap", List.of(
						"consistent-hashing",
						"caching",
						"kafka",
						"rate-limiting",
						"idempotency-retries",
						"distributed-locks"));
	}
}
