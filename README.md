# Teste API automatizado

Este é um projeto básico para verificar conhecimentos de testes automatizados de API utilizando Rest Assured e Java.
Projeto de Automação de API

# Este projeto desenvolvido em Java e utilizando as seguintes tecnologias:

    Java 17
    Gradle (gerenciador de dependências)
    Groovy (linguagem de script para testes)
    JUnit 4 (framework de testes)
    RestAssured 5 (biblioteca para testes de API)
    Lombok (biblioteca para redução de código boilerplate)
    POJO (Plain Old Java Object)

# Funcionalidades

    Cenário: Criação de usuário com sucesso
    Cenário: Criação de usuário com invalido (Teste ignorado pela condição atual da API)
    Cenário: Busca de usuário com sucesso
    Cenário: Busca de usuário inexistente
    Cenário: Validação de contrato da busca de usuário com sucesso
   

# Requisitos

    Java 17 ou superior instalado
    Gradle instalado
    Dependências e plugins do arquivo build.gradle instalados

# Executando os testes

Para executar os testes de API, execute o seguinte comando no terminal:

    Windows: gradle test
    Linux: ./gradlew test
