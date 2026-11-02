# Spring Boot Essencials

API REST em Java com Spring Boot, construída enquanto estudo o curso "Spring Boot: criando sua primeira API REST" (Souza Dev) e os guias oficiais do Spring.

Cada etapa vira um commit, então o histórico mostra a evolução do projeto.

## Tecnologias

- Java 21
- Spring Boot 4.1.2 (Spring Web)
- Maven
- Lombok
- SpringDoc OpenAPI (documentação da API)

## Estrutura

```
src/main/java/br/com/yoyo/spring_boot_essencials
├── config        # configurações da aplicação
├── controller    # endpoints REST (camada de entrada)
├── service       # regras de negócio
├── database
│   ├── model      # entidades
│   └── repository # acesso a dados
├── exception     # exceções da aplicação
├── handler       # tratamento global de erros
└── utils         # utilitários
```

Fluxo de uma requisição: `controller → service → repository → objeto Java → JSON`

## Como rodar

Pré-requisito: Java 21.

```bash
./mvnw spring-boot:run
```

A API sobe em `http://localhost:8080`.

## Endpoints

| Método | Rota | Descrição |
|---|---|---|
| GET | `/...` | _(preencher com os controllers criados)_ |

## O que aprendi

### Etapa 1 · Controllers simples
- `@RestController` marca a classe como controller que responde direto no corpo da resposta.
- `@RequestMapping` na classe define o prefixo da rota; `@GetMapping` no método define o endpoint.
- Testei os endpoints no Postman.

### Etapa 2 · Resposta em JSON (em andamento)
- Guia oficial: [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service)
- Record como objeto de resposta, `@RequestParam` e conversão automática para JSON.

## Próximos passos

- [ ] Resposta em JSON com record
- [ ] `@RequestParam` com valor padrão
- [ ] Camada de service
- [ ] Validação e tratamento de erros
- [ ] Testes
