# 🚀 SpringAWS - API REST com Spring Boot

> Uma aplicação moderna e eficiente para gerenciar **Funcionários** e **Pessoas** com banco de dados PostgreSQL!

---

## ✨ O que é esse projeto?

**SpringAWS** é uma API REST desenvolvida com **Spring Boot** que oferece endpoints para consultar e gerenciar dados de funcionários e pessoas. É um projeto perfeito para quem está aprendendo ou desenvolvendo microserviços em Java! 🎓

---

## 🎯 Funcionalidades Principais

### 👥 Gerenciamento de Pessoas
- ✅ Listar todas as pessoas
- ✅ Buscar pessoa por ID
- ✅ Dados precários com dados de exemplo (John, Jane, Doe)

### 💼 Gerenciamento de Funcionários
- ✅ Listar todos os funcionários
- ✅ Buscar funcionário por ID
- ✅ Tratamento de erros personalizado

### 🛡️ Recursos Avançados
- 🔒 Lombok para código mais limpo
- 📚 Spring Data JPA para persistência de dados
- 🗄️ Suporte a PostgreSQL
- ⚡ Spring DevTools para desenvolvimento mais rápido

---

## 📋 Tecnologias Utilizadas

| Tecnologia | Versão | Descrição |
|-----------|--------|-----------|
| **Java** | 21 | Linguagem principal 🔧 |
| **Spring Boot** | 4.0.5 | Framework web ⚙️ |
| **PostgreSQL** | Latest | Banco de dados 🗄️ |
| **Lombok** | Latest | Reduz código boilerplate 📦 |
| **JPA** | Latest | ORM para banco de dados 🔗 |
| **Maven** | 3.x | Gerenciador de dependências 📦 |

---

## 🚀 Como Executar a Aplicação

### 📋 Pré-requisitos
Você precisa ter instalado:
- ☕ **JDK 21** ou superior
- 🗄️ **PostgreSQL** rodando localmente
- 📦 **Maven** 3.6+

### ⚙️ Passo 1: Clone ou Abra o Projeto
```bash
cd D:\IdeaProjects\SpringAWS
```

### 📊 Passo 2: Configure o Banco de Dados
Edite o arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://endereco_do_seu_banco:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 🔨 Passo 3: Compile e Execute
```bash
# Compilar o projeto
mvn clean install

# Executar a aplicação
mvn spring-boot:run
```

Ou no Windows:
```cmd
mvnw spring-boot:run
```

✅ Pronto! Sua aplicação estará rodando em: **http://localhost:8080** 🎉

---

## 📡 Endpoints Disponíveis

### 👥 Pessoas

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `GET` | `/persons` | 📋 Listar todas as pessoas |
| `GET` | `/persons/{id}` | 🔍 Buscar pessoa por ID |

**Exemplo de Requisição:**
```bash
curl http://localhost:8080/persons
```

**Resposta:**
```json
[
  {
    "id": 1,
    "name": "John"
  },
  {
    "id": 2,
    "name": "Jane"
  },
  {
    "id": 3,
    "name": "Doe"
  }
]
```

---

### 💼 Funcionários

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `GET` | `/employees` | 📋 Listar todos os funcionários |
| `GET` | `/employees/{id}` | 🔍 Buscar funcionário por ID |

**Exemplo de Requisição:**
```bash
curl http://localhost:8080/employees/1
```

---

## 🏗️ Estrutura do Projeto

```
SpringAWS/
│
├── 📝 pom.xml                          # Configuração Maven
│
├── 📂 src/
│   ├── 📂 main/
│   │   ├── 📂 java/com/springaws/
│   │   │   ├── SpringAwsApplication.java       # Classe principal
│   │   │   │
│   │   │   ├── 📂 controller/
│   │   │   │   ├── EmployeeController.java     # Endpoints de funcionários
│   │   │   │   └── PersonController.java       # Endpoints de pessoas
│   │   │   │
│   │   │   ├── 📂 model/
│   │   │   │   ├── Employee.java               # Entity de Funcionário
│   │   │   │   └── Person.java                 # Entity de Pessoa
│   │   │   │
│   │   │   ├── 📂 repository/
│   │   │   │   ├── EmployeeRepository.java     # DAO para Funcionários
│   │   │   │   └── PersonRepository.java       # DAO para Pessoas
│   │   │   │
│   │   │   └── 📂 GobalException/
│   │   │       ├── EmployeeNotFoundException.java
│   │   │       └── EmployeeNotFoundAdvice.java
│   │   │
│   │   └── 📂 resources/
│   │       └── application.properties          # Configurações da aplicação
│   │
│   └── 📂 test/
│       └── java/com/springaws/
│           └── SpringAwsApplicationTests.java
│
└── 📦 target/                          # Arquivos compilados
```

---

## 🧪 Testes

Para executar os testes unitários:

```bash
mvn test
```

🎯 O projeto já vem com testes básicos configurados!

---

## 🐛 Tratamento de Erros

### ❌ Funcionário não encontrado
Quando você tenta acessar um funcionário que não existe, a aplicação retorna:

```json
{
  "message": "Funcionário com ID 999 não encontrado!",
  "status": 404
}
```

A aplicação possui uma classe `EmployeeNotFoundException` que trata esses casos! ✨

---

## 🛠️ Desenvolvimento

### 🔥 Dicas para Desenvolvimento

1. **Hot Reload** ♻️
   - O Spring DevTools está ativado, então mudanças serão recarregadas automaticamente!

2. **Código Limpo** ✨
   - Use Lombok com `@Data`, `@Builder` e `@RequiredArgsConstructor`

3. **Banco de Dados** 🗄️
   - Configure sua instância PostgreSQL antes de rodar

---

## 📦 Dependências Principais

```xml
✅ Spring Boot Starter Web MVC
✅ Spring Data JPA
✅ PostgreSQL Driver
✅ Lombok
✅ Spring DevTools
✅ HATEOAS
```

---

## 📝 Versão e Informações

- **Versão**: 0.0.1-SNAPSHOT
- **Desenvolvido com**: ❤️
- **Java**: 21
- **Spring Boot**: 4.0.5

---

## 🤝 Como Contribuir

1. 🍴 Faça um fork do projeto
2. 🌿 Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push para a branch (`git push origin feature/AmazingFeature`)
5. 📝 Abra um Pull Request

---

## 📄 Licença

Este projeto está sob licença livre para uso educacional! 📚

---

## 💬 Dúvidas?

Se tiver dúvidas ou sugestões:
- 📧 Abra uma Issue
- 💡 Contribua com melhorias
- 🤔 Pergunte no chat!

---

<div align="center">

### 🚀 Desenvolvido com paixão por desenvolvimento em Java!

**⭐ Se esse projeto foi útil, deixe uma star!**

</div>

