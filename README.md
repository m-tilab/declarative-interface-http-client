# 🧭 Three Generations of HTTP Clients in Spring Boot

This project demonstrates **three different approaches** to building HTTP clients in modern Spring Boot (3.x) using the [`RestClient`](https://docs.spring.io/spring-framework/docs/current/reference/html/integration.html#rest-http-interface), Declarative Interfaces, and the new `@ImportHttpServices` annotation.

We use the [JSONPlaceholder](https://jsonplaceholder.typicode.com/) fake REST API to simulate user-related HTTP interactions.

---

## 📚 Table of Contents

- [Overview](#overview)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [HTTP Client Approaches](#http-client-approaches)
  - [1. Using `RestClient`](#1-using-restclient)
  - [2. Declarative HTTP Interface](#2-declarative-http-interface)
  - [3. `@ImportHttpServices`](#3-importhttpservices)
- [Endpoints](#endpoints)
- [License](#license)

---

## ✅ Overview

Spring has continuously evolved its HTTP client capabilities:

| Generation | Feature | Introduced In |
|------------|---------|---------------|
| 1️⃣ | `RestClient` (fluent API) | Spring Framework 6.1 |
| 2️⃣ | Declarative HTTP Interface via `HttpServiceProxyFactory` | Spring Framework 6.0 |
| 3️⃣ | `@ImportHttpServices` annotation | Spring Framework 7 / Boot 4 |

This repository showcases all three techniques in a clean, comparable structure to help developers choose the best approach for their use case.

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot 3.2.x
- Spring Framework 6.1+
- Maven or Gradle
- JSONPlaceholder API

---

## 🗂 Article Link
[https://mtilab.medium.com/declarative-rest-clients-with-spring-framework-7-31eaba02d004](https://mtilab.medium.com/declarative-rest-clients-with-spring-framework-7-31eaba02d004)

