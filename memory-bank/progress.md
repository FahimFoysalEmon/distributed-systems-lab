# Progress

## What works

- [x] Git repo at `~/Projects/distributed-systems-lab`
- [x] Spring Boot app skeleton (Maven) — build + tests pass
- [x] Actuator health endpoint
- [x] Lab info API
- [x] Memory bank for session continuity
- [x] Project-local Maven settings (Maven Central; avoids broken global Nexus mirror)

## What's left

- [ ] Consistent hashing lab
- [ ] Caching lab
- [ ] Kafka playground (+ Docker Compose)
- [ ] Rate limiting
- [ ] Idempotency / retries
- [ ] Distributed locks

## Known issues

- Host default `java` may be 8; use SDKMAN `25.0.4-amzn` (or any 21+) for builds.
