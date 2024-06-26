# Projeto de Estudo: API REST com Java, Spring Boot e JPA/Hibernate

<div align="center">
  <img alt="Java" title="Java" src="https://github.com/Jordaobm/secao-23-projeto-web-services-com-spring-boot-e-jpa-hibernate/blob/main/doc/java.png" width="300px" />
</div>

## Descrição

Este é um projeto simples desenvolvido com o objetivo de aprender e aplicar os conceitos de desenvolvimento de APIs RESTful utilizando a linguagem Java. O projeto implementa um sistema de CRUD (Create, Read, Update, Delete) para as seguintes entidades: Usuários, Pedidos, Produtos e Categorias.

Este projeto foi desenvolvido durante o curso **"Java COMPLETO Programação Orientada a Objetos + Projetos"** ministrado pelo professor Nelio Alves na plataforma UDEMY. O projeto específico faz parte da Seção 23 do curso: **"Projeto: Web services com Spring Boot e JPA / Hibernate"**.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto.
- **Spring Boot**: Framework para simplificar a criação de aplicações Java baseadas em Spring.
- **JPA / Hibernate**: Framework de mapeamento objeto-relacional para gerenciamento de dados.
- **H2 Database**: Banco de dados em memória utilizado para simplificação dos testes e desenvolvimento.
- **Docker**: Ferramenta para criar e gerenciar containers.
- **Docker Compose**: Ferramenta para definir e gerenciar multi-containers Docker.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências.
- **Postman**: Utilizado para testar as requisições da API.

## Funcionalidades

O projeto permite realizar operações de CRUD para as seguintes entidades:

1. **Usuários** (CRUD)
2. **Pedidos** (R)
3. **Produtos** (R)
4. **Categorias** (R)

## Como Executar o Projeto

### Pré-requisitos

- Java JDK 17 ou superior
- Maven
- Docker
- Docker Compose

### Passos para Execução

1. **Clone o repositório:**
   ```sh
   git clone https://github.com/Jordaobm/secao-23-projeto-web-services-com-spring-boot-e-jpa-hibernate
   ```
2. **Navegue até o diretório do projeto:**
   ```sh
   cd secao-23-projeto-web-services-com-spring-boot-e-jpa-hibernate
   ```
3. **Edite o arquivo aplication.properties para que acesse o ip do seu container:**
   ```sh
   spring.datasource.url=jdbc:postgresql://192.168.26.130:5432/postgres
   ```
4. **Compile o projeto utilizando Maven:**
   ```sh
   mvn clean install
   ```
5. **Crie e inicie os containers Docker:**
   ```sh
   docker-compose up --build
   ```
6. **Acesse a aplicação:**
   - A aplicação estará disponível no endereço: `http://localhost:8080`

## Docker

Para facilitar a execução da aplicação e do banco de dados, foram criados um `Dockerfile` e um `docker-compose.yml`. Esses arquivos permitem subir a aplicação e o banco de dados em containers Docker de forma rápida e simples.

### Dockerfile

O `Dockerfile` contém as instruções para construir a imagem Docker da aplicação.

### Docker Compose

O `docker-compose.yml` define os serviços necessários para a aplicação, incluindo o serviço da aplicação e o serviço do banco de dados.

## Contato

Para mais informações sobre o curso e o projeto, entre em contato:

- **Professor:** Nelio Alves
- **Plataforma:** UDEMY
- **Curso:** [Java COMPLETO Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-completo-programacao-orientada-a-objetos-projetos/)
