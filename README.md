# 🚀 Spring Boot Observability System

A production-style backend system with authentication, monitoring, logging, and alerting.

---

## 🔥 Features

- 📊 Monitoring with Prometheus
- 📈 Visualization with Grafana
- 📜 Centralized Logging with Loki
- 🤖 LLM-based Error Analysis
- 🚨 Alerting System (Grafana Alerts)

---

## 🧱 Tech Stack

- Java + Spring Boot
- MySQL
- Redis
- Docker
- Prometheus
- Grafana
- Loki

---

## 🧪 Test APIs

| Endpoint | Description |
|--------|------------|
| /test/error | Divide by zero error |
| /test/array | Array out of bound exception |
| /test/random | Random errors |

---

## 🐳 Run with Docker

```bash
docker-compose up -d
