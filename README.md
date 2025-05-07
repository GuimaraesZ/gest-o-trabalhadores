#Lembrando que para elaborar um projeto simples desse não precisa utilizar Spring Boot, certo?
Utilize para apenas para fins de aprendizado, mas o projeto pode ser feito sem ele.

# Empresa

Este é um projeto Java desenvolvido com Spring Boot e Maven. Ele simula a gestão de trabalhadores, departamentos e contratos por hora.

## Funcionalidades

- Cadastro de trabalhadores com nível (JUNIOR, MID_LEVEL, SENIOR) e salário base.
- Associação de trabalhadores a departamentos.
- Registro de contratos por hora para trabalhadores.
- Cálculo de renda de um trabalhador em um mês/ano específico.

## Estrutura do Projeto

- **`src/main/java/com/example/Empresa/model`**: Contém as classes de modelo, como `Worker`, `Department`, `HourContract` e o enum `WorkerLevel`.
- **`src/main/java/com/example/Empresa/Controller`**: Contém a classe `Program`, que implementa a lógica principal do programa.

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Spring Boot**: Framework para simplificar o desenvolvimento.
- **Maven**: Gerenciador de dependências e build.
- **Lombok**: Para reduzir o boilerplate de código.

## Como Executar

1. Certifique-se de ter o Java 17+ e o Maven instalados.
2. Clone este repositório:
   ```bash
   git clone https://github.com/GuimaraesZ/empresa.git