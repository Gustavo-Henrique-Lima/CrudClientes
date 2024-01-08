# CrudClientes

Este projeto é um CRUD simples de clientes, desenvolvido durante o Bootcamp Spring da escola DevSuperior. 

Ele foi criado para servir de avaliação do módulo 01 do Bootcamp.

## Como Rodar o Projeto

### Pré-requisitos

- Java JDK 11 ou superior
- Maven 3.1 ou superior
### Passos

1. **Clonar o Repositório:**

   ```bash
   git clone git@github.com:Gustavo-Henrique-Lima/CrudClientes.git

2. **Navegue até o diretório do projeto:**

    ```bash
    cd CrudClientes

3. **Instale as dependências:**

    ```bash
    mvn install

4. **Inicie o servidor de desenvolvimento:**

    ```bash
   mvn spring-boot:run

## Funcionalidades
   ### Produtos

    Listar clientes:
      Endpoint para recuperar a lista completa de clientes.
      
    Detalhes do cliente:
      Endpoint para obter detalhes de um cliente específico com base no ID.
    
    Cadastrar cliente:
      Endpoint para adicionar um novo cliente à base de dados.
    
    Atualizar cliente:
      Endpoint para modificar os detalhes de um cliente existente com base no ID.
    
    Excluir cliente:
      Endpoint para remover um produto da base de dados com base no ID.

## Documentação

  O projeto inclui documentação detalhada para facilitar o entendimento e a interação com a aplicação.
  A seguir estão os recursos de documentação disponíveis.

  ### Swagger

   A API é documentada usando o Swagger, que fornece uma interface interativa para explorar os endpoints 
  da aplicação.
  ### Acesso ao Swagger:
  **Com o projeto rodando**
  
  O Swagger pode ser acessado através do link: [Swagger UI](http://localhost:8080/swagger-ui/index.html).
  
  A interface do Swagger oferece uma visão interativa dos endpoints, permitindo testar as operações
  diretamente na documentação.

## Perfis de configuração

  O projeto oferece dois perfis de configuração para atender diferentes ambientes: **test** (padrão) e **dev**. A escolha entre esses     perfis é determinada no arquivo `application.properties`.

  #### **Perfil de Teste (Padrão)**
  
  - **Banco de Dados**: Utiliza o H2 Database, dispensando configurações adicionais.
  
  #### **Perfil de Desenvolvimento (Dev)**
  
 1. Configure o perfil ativo para "dev" no arquivo `application.properties`.
 2. Certifique-se de que a linha `spring.profiles.active` esteja definida como "dev".

    ```properties
    spring.profiles.active=dev
3. Certifique-se de que o arquivo application-dev.properties já existe no projeto e está configurado para o MySQL local.
   ```properties
   # DATASOURCE
   spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
   spring.datasource.url=jdbc:mysql://localhost:3306/seubanco?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
   spring.datasource.username=seuusuario
   spring.datasource.password=senhadoseuusuario
    
   # JPA, SQL
   spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.format_sql=true
    
   spring.h2.console.enabled=false
4. Certifique-se de ter um banco MySQL local configurado conforme especificado.
   
Agora, o projeto usará o perfil de desenvolvimento, com o MySQL como banco de dados.

## Licença
 Este projeto está licenciado sob a licença MIT.

    
