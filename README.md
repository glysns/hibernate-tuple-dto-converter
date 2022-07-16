# Hibernate Tuple DTO Converter

#### Autor
- [Gleyson Sampaio](https://github.com/glysns)

## Tuple Converter

Em Java baseado no ORM e Hibernate, qual projeto que não encontramos o dilema em termos que converter
nossa lista de array de campos para os dtos com base em consultas nativas em um banco de dados relacional?
Confesso que me tira a paz ter que declarar cada campo versus o seu indice de forma manual.
Diante desta realidade em nossos projetos, eu resolvi estudar algumas alternativas de automação e
encontrei um recurso super poderoso no hibernate denominado de Tuple.
Tuples cria uma lista de elementos nomeados de acordo com o alias correspondente ao atributo do seu dto,
logo criamos um mecanimo de interação destes elementos e instanciamos nossos objetos e setamos os valores
atráves de um recurso do Spring conhecido como `PropertyAccessor` baseado no conceito de `Mutations`.

Você pode adaptar a nomenclatura dos componentes e aplicar o uso de Herança e Generics para deixar mais aderente ao teu projeto.

#### Estrutura do Projeto

![](/img/src.png "Src")

#### Exemplos de conversão

![](/img/converter.png "Src")

#### Resultado via Swagger

![](/img/dto_list.png "Src")

#### Tecnologias

* Java
* JPA / Hibernate
* Spring Boot Web
* Spring Boot Data JPA
* Open API - Swagger
* H2 Database
* Mutation