# Tech context

## Stack

| Piece | Choice |
|-------|--------|
| Language | Java 21 (`java.version` in pom) |
| Local JDK | Corretto 25 via SDKMAN (`25.0.4-amzn`) — default shell may still be Java 8 |
| Framework | Spring Boot **4.1.1** |
| Build | Maven Wrapper (`./mvnw`) |
| Web | `spring-boot-starter-webmvc` |
| Ops | Actuator |
| Validation | `spring-boot-starter-validation` |

## Constraints

- Do **not** add Docker until we start Kafka / multi-service topics.
- Default machine Java may be 8 — always use SDKMAN Java 21+ for builds.

## Commands

```bash
sdk use java 25.0.4-amzn
./mvnw test
./mvnw spring-boot:run
```

## Maven notes

Global `~/.m2/settings.xml` may point at unreachable corporate Nexus mirrors.
This repo ships `.mvn/settings.xml` + `.mvn/maven.config` so `./mvnw` uses Maven Central.
