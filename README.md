# MDS Platform Starter

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.6-brightgreen)
![Starter](https://img.shields.io/badge/Spring-Starter-success)
![Maven](https://img.shields.io/badge/Maven-3.9-blue)
![License](https://img.shields.io/badge/license-MIT-green)
![Platform](https://img.shields.io/badge/MDS-Ecosystem-blueviolet)

Spring Boot starter that aggregates MDS Platform libraries, enabling applications to adopt architecture standards with a single dependency.

---

## Overview

This starter simplifies adoption of the MDS ecosystem by importing reusable modules automatically.

Applications can enable enterprise-grade features with one dependency.

---

## Included Modules

- shared-core-lib
- spring-error-pattern
- spring-comm-pattern
- spring-retry-pattern
- spring-token-pattern
- spring-security-pattern
- spring-crypto-pattern
- spring-data-pattern
- spring-cache-pattern
- spring-crud-pattern

---

## Technical Stack

- Java 21
- Spring Boot 4.0.6
- Maven
- Spring Auto Configuration
- Modular Architecture

---

## Installation

```xml
<dependency>
   <groupId>br.com.mds.platform</groupId>
   <artifactId>mds-platform-starter</artifactId>
   <version>1.0.0</version>
</dependency>
```

---

## Architecture

Application
      ↓
MDS Platform Starter
      ↓

shared-core-lib
spring-error-pattern
spring-comm-pattern
spring-retry-pattern
spring-token-pattern
spring-security-pattern
spring-crypto-pattern
spring-data-pattern
spring-cache-pattern
spring-crud-pattern

---

## Future Roadmap

- Selective module activation
- Auto configuration
- Metrics integration
- Feature toggles
- AI-assisted configuration

---

Built with ❤️ by Martins Desenvolvimento de Sistemas
