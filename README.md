# Desafio Controle de Fluxo

Este projeto faz parte do desafio do **Bootcamp DIO - Bradesco - Java Cloud Native** e tem como objetivo exercitar conceitos de **controle de fluxo** em Java. O sistema recebe dois números inteiros como entrada e realiza uma contagem baseada na diferença entre eles. Se o primeiro número for maior que o segundo, o sistema lançará uma exceção personalizada.

## 📌 Funcionalidades
- Recebe dois números inteiros via **entrada do usuário**.
- Verifica se o primeiro número é **maior que o segundo**.
- Realiza uma **contagem** e imprime os números incrementados.
- Lança uma **exceção personalizada** (`ParametrosInvalidosException`) caso os parâmetros sejam inválidos.

## 🚀 Tecnologias Utilizadas
- **Java** (versão 8 ou superior)
- **Scanner** (para entrada de dados)
- **Exceções personalizadas**

## 📂 Estrutura do Projeto
```
DesafioControleFluxo/
│── src/
│   ├── Contador.java
│   ├── ParametrosInvalidosException.java
│── README.md
│── .gitignore
```

## 🛠 Como Executar

### 1️⃣ Clonar o Repositório
```bash
git clone https://github.com/PatrickyLucas/DesafioControleFluxo.git
cd DesafioControleFluxo
```

### 2️⃣ Compilar o Código
```bash
javac src/Contador.java src/ParametrosInvalidosException.java
```

### 3️⃣ Executar o Programa
```bash
java src.Contador
```

## 📜 Exemplo de Uso

### Entrada:
```
Digite o primeiro parâmetro:
12
Digite o segundo parâmetro:
30
```

### Saída:
```
Imprimindo o número 1
Imprimindo o número 2
...
Imprimindo o número 18
```

Se o primeiro número for **maior** que o segundo:
```
O segundo parâmetro deve ser maior que o primeiro
```

## ⚠️ Tratamento de Erros

Caso o usuário insira valores inválidos, o sistema lançará uma exceção `ParametrosInvalidosException`, garantindo que a lógica seja respeitada.

## 📌 Autor

Desenvolvido por [Patricky Lucas](https://github.com/PatrickyLucas).

