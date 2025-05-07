# Bradesco Java Cloud Native
[Java RESTful API] Publicando sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +String name
    }

    class Account {
        +String number
        +String agency
        +double balance
        +double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +double limit
    }

    class News {
        +String icon
        +String description
    }

    User --> Account : has
    User --> Card : has
    User --> "0..*" Feature : has
    User --> "0..*" News : has
```


### Criação do Projeto
 * Criação: Spring Initializr
 * Versionamento da API: GitHub
 * Abstração e Modelagem de Domínio: Figma, ChatGPT(Mermaid) e JPA
 * Implementação do Backend: Spring Boot e Java 17
 * Deploy e Monitoramento: RailWay (PostgreSQL e CI/CD da API)
   
### Social Media
* Instagram: https://www.instagram.com/argeu.souza
* My GitHub: https://www.github.com/argeulimbo
* Linkedin: https://www.linkedin.com/in/argeu-phelipe-de-souza-40053a227/
