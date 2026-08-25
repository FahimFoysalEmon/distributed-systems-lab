# System patterns

## Architecture

Single Spring Boot module. Concepts live in isolated packages:

```
lab.distributedsystems
  web/                 # shared HTTP surface
  lab.consistenthash/  # topic packages (added as we go)
  lab.kafka/
  ...
```

## Conventions

- Prefer plain Java for algorithms; Spring only for wiring / HTTP / config.
- One topic = one package + optional `NOTES.md` + tests.
- Docker Compose later for Kafka/Redis — not required for algorithm topics.

## Critical paths

- Boot: `DistributedSystemsLabApplication`
- Health: Actuator `/actuator/health`
- Lab meta: `GET /api/lab`
