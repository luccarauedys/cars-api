## 📝 Descrição

Mini API para testar conhecimentos básicos adquiridos no primeiro dia do curso de Java com Spring Boot.

## 🚀 Tecnologias

- [Java](https://www.java.com)
- [SpringBoot](https://spring.io/projects/spring-boot)

## 📦 Instalação

Para clonar o repositório, utilize um dos comandos abaixo:

```bash
$ git clone https://github.com/luccarauedys/cars-api

# OU

$ git clone git@github.com:luccarauedys/cars-api.git
```

## 📌 Funcionalidades

- Obter lista de carros
- Cadastrar novo modelo de carro

## 🔀 Rotas

- **GET** /api/cars

  - Retorna uma lista no formato:
    ```json
    [
      {
        "model": "Fiat Argo 1.3",
        "manufacturer": "Fiat",
        "dateOfManufacture": "10/02/2006",
        "price": 10000.0,
        "modelYear": 2023
      }
    ]
    ```

- **POST** /api/cars

  - Para cadastrar um novo carro, deve-se enviar as seguintes informações:

    ```json
    {
      "model": "Fiat Argo 1.3",
      "manufacturer": "Fiat",
      "dateOfManufacture": "10/02/2006",
      "price": 10000.0,
      "modelYear": 2023
    }
    ```
