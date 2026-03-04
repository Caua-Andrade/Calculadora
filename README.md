```markdown
# 📟 Calculadora em Java

Projeto de uma **calculadora simples desenvolvida em Java**, criada com o objetivo de praticar lógica de programação, entrada e saída de dados pelo terminal e conceitos básicos de Programação Orientada a Objetos (POO).

---

## 🧠 Sobre o Projeto

Esta aplicação funciona via **linha de comando**, permitindo que o usuário realize operações matemáticas básicas entre dois números.

O projeto foi desenvolvido como prática de aprendizado em Java, focando em:

- Estrutura de pacotes
- Organização de classes
- Lógica condicional
- Tratamento de erros
- Interação com o usuário via terminal

---

## 🚀 Funcionalidades

- ✅ Soma
- ✅ Subtração
- ✅ Multiplicação
- ✅ Divisão
- ✅ Tratamento de divisão por zero
- 🔁 Execução contínua até o usuário decidir encerrar

---

## 🛠 Tecnologias Utilizadas

- **Java**
- Estrutura de pacotes (`br.com.cod3r.calc`)
- Execução via terminal

---

## 📂 Estrutura do Projeto

```

Calculadora/
│
├── src/
│   └── br/
│       └── com/
│           └── cod3r/
│               └── calc/
│                   ├── (arquivos .java)
│
├── .idea/
├── .gitignore
└── calculadora.iml

````

---

## 💻 Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/Caua-Andrade/Calculadora.git
````

### 2️⃣ Entrar na pasta do projeto

```bash
cd Calculadora
```

### 3️⃣ Compilar o projeto

```bash
javac -d bin src/br/com/cod3r/calc/*.java
```

### 4️⃣ Executar o programa

```bash
java -cp bin br.com.cod3r.calc.Main
```

> ⚠️ Caso a classe principal tenha outro nome, substitua `Main` pelo nome correto.

---

## 🧪 Exemplo de Uso

```
Informe o primeiro número:
> 10

Escolha a operação (+ - * /):
> *

Informe o segundo número:
> 5

Resultado: 50
```

---

## 💡 Possíveis Melhorias Futuras

* ➕ Adicionar potência e raiz quadrada
* 📜 Implementar histórico de operações
* 🖥 Criar versão com interface gráfica (JavaFX ou Swing)
* 🧪 Adicionar testes automatizados

---
