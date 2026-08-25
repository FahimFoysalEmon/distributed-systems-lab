# distributed-systems-lab

Hands-on Spring Boot lab for learning **distributed systems** and **system design** by implementing concepts yourself (consistent hashing, Kafka, caching, etc.).

## Stack

- Java 21 (run with JDK 25 locally via SDKMAN)
- Spring Boot 4.1
- Maven

Docker / Kafka come later — start with plain Spring Boot.

## Run

```bash
# Prefer Java 21+ (this repo sets java.version=21)
sdk use java 25.0.4-amzn   # if you use SDKMAN

./mvnw spring-boot:run
```

- App: http://localhost:8080
- Health: http://localhost:8080/actuator/health
- Lab info: http://localhost:8080/api/lab

## How we'll learn

Each topic gets:

1. A short **system-design note** (why it exists, trade-offs)
2. A **from-scratch implementation** (or thin integration)
3. A **demo endpoint / test** so you can poke at it

Suggested order:

| # | Topic | Status |
|---|--------|--------|
| 1 | Consistent hashing | next |
| 2 | Caching (TTL, eviction, stampede) | planned |
| 3 | Kafka producers / consumers / partitions | planned (needs Docker later) |
| 4 | Rate limiting | planned |
| 5 | Idempotency & retries | planned |
| 6 | Distributed locks | planned |

Package layout under `lab.distributedsystems`:

- `web` — HTTP entry points
- `lab.<topic>` — one package per concept (e.g. `lab.consistenthash`)

## Memory bank

Project context for this chat lives in `memory-bank/` so we can resume learning across sessions.
