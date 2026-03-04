# 📟 Calculadora — Projeto em Java

Este repositório contém uma **calculadora simples desenvolvida em Java**, criada com o objetivo de praticar lógica de programação, manipulação de entrada/saída via terminal e conceitos de programação orientada a objetos (POO). ([GitHub][1])

---

## 🧠 Sobre o Projeto

A Calculadora é um programa de linha de comando que permite ao usuário realizar operações matemáticas básicas entre números. O foco principal é fornecer uma ferramenta de estudo para quem está aprendendo Java e lógica de programação. ([GitHub][1])

---

## 🚀 Funcionalidades

* ✅ Soma de dois números
* ✅ Subtração
* ✅ Multiplicação
* ✅ Divisão (com tratamento de divisão por zero)
* ⚙️ Interface simples no terminal
* 🔁 Possibilidade de realizar múltiplos cálculos em sequência

> ⚠️ **Nota:** O programa trabalha via linha de comando, recebendo inputs do usuário e exibindo o resultado no console. ([GitHub][1])

---

## 🧾 Pré-requisitos

Antes de executar este projeto, você precisa ter instalado em sua máquina:

* 🟩 **Java Development Kit (JDK) 8 ou superior**
* 📁 Um terminal/linha de comando
* 🧑‍💻 Familiaridade básica com Java

---

## 📂 Estrutura do Projeto

O projeto está organizado utilizando o padrão de pacotes Java:

```
src/
└── br/
    └── com/
        └── cod3r/
            └── calc/
                ├── (arquivos .java da calculadora)
                └── …
.idea/                   # Configurações da IDE
.gitignore               # Arquivos ignorados pelo Git
calculadora.iml          # Configuração de projeto da IDE
```

> Todo o código-fonte está em Java (100%). ([GitHub][1])

---

## 💻 Como Executar

Siga estes passos para **compilar e rodar** o programa:

### 1. Clone este repositório

```bash
git clone https://github.com/Caua-Andrade/Calculadora.git
```

### 2. Navegue até o diretório

```bash
cd Calculadora
```

### 3. Compile os arquivos Java

```bash
javac -d bin src/br/com/cod3r/calc/*.java
```

> O comando acima compila o código e coloca os arquivos `.class` na pasta `bin`. Se preferir, use sua IDE favorita (IntelliJ, Eclipse, VS Code, etc.) e simplesmente execute o projeto. ([GitHub][1])

### 4. Rode o programa

```bash
java -cp bin br.com.cod3r.calc.Main
```

📌 **Dica:** dependendo da sua classe principal (ex.: `Main.java` ou `App.java`), ajuste o nome no comando acima.

---

## 🧪 Exemplos de Uso

Depois de executar o programa, você verá algo como:

```
Informe o primeiro número:
> 10
Escolha a operação (+ - * /):
> *
Informe o segundo número:
> 5
Resultado: 50
```

Você pode repetir o processo várias vezes até decidir encerrar.

---

## 🛠 Tecnologias Usadas

| Tecnologia           | Finalidade                           |
| -------------------- | ------------------------------------ |
| 🟨 Java              | Linguagem principal da aplicação     |
| 📦 Pacotes Java      | Organização modular de código        |
| 🖥️ Linha de comando | Interface simples para entrada/saída |

---

## 💡 Próximas Melhorias

Se desejar evoluir o projeto, algumas ideias incluem:

* 🧮 Adicionar suporte a operações avançadas (potência, porcentagem, raiz)
* 📊 Histórico de cálculos
* 🧠 Validação de entrada mais robusta
* 🪟 Interface gráfica (JavaFX ou Swing)

---
