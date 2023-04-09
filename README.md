<h1 align="center"> S107 - L1 </h1>
<p align="center"> Exercícios práticos</p>

<p align="center">
<img src="https://img.shields.io/static/v1?label=License&message=MIT&color=00bfff&style=plastic"/>

<img src="https://img.shields.io/static/v1?label=LP&message=Java&color=daa520&style=plastic"/>

<img src="https://img.shields.io/static/v1?label=GD&message=Maven&color=9acd32&style=plastic"/>

<img src="https://img.shields.io/static/v1?label=IDE&message=IntelliJ&color=5f9ea0&style=plastic"/>
  
[![Exercicio Pratico - CI](https://github.com/MaMBassi/S107/actions/workflows/algoritmo_ord.yml/badge.svg)](https://github.com/MaMBassi/S107/actions/workflows/algoritmo_ord.yml)
  
</p>

### :books: Exercícios Práticos

- [x] Exercício 01: CI/CD - Pipeline

### :point_right: Tecnologias

- Gerenciador de dependências: Maven
- Dependência: JUnit
- Linguagem de Programação: Java
- IDE: IntelliJ

### :heavy_check_mark: Execução do Sistema Hipotético

Para a execução dos projetos, é possível fazer o download do código direto do GitHub ou através do git clone https://github.com/MaMBassi/S107.git. Contudo, para a segunda opção, é necessário ter o [Git](https://git-scm.com) instalado.

- Abrir o arquivo no seu editor escolhido;

- Instalar as dependências do pom.xml;

- Em src, executar a classe Principal do Exercício Strategy.

### :computer: Sistema Hipotético: Sistema de Ordenar Dados

- Algoritmos de Ordenação:
  - ArraySort: ordena os dados, em ordem crescente, utilizando o método .sort( ) do Collections;
  - InsertionSort: ordena os dados, em ordem crescente, utilizando o Algoritmo Insertion Sort;
  - BubbleSort: ordena os dados, em ordem crescente, utilizando o Algoritmo Bubble Sort;
  - ArraySortDecrescente: ordena os dados, em ordem decrescente, utilizando o método .sort( ) do Collections;
  - 
- src/main/java/package:
  -  Principal: classe main que será executada para o sistema ordenar os dados de uma lista pré-definida, de acordo com o algoritmo de ordenação escolhido.
  -  SistemaOrdenarDados: classe abstrata.
  -  AlgoritmoOrdenar: interface.
  -  /algoritmo:
    - AlgoritmoAS, AlgoritmoIS, AlgoritmoBS, AlgoritmoASD: família de Algoritmos.  

### :mag: Testes unitários

1. Caso de teste: Verificar se será ordenado com o algoritmo escolhido:
   - testeArraySort, testeInsertionSort, testeBubbleSort, testeArraySortD.
2. Caso de teste: Verificar o resultado da ordenação de cada algoritmo para números positivos:
   - testeArraySortResultado, testeInsertionSortResultado, testeBubbleSortResultado, testeArraySortDResultado.
3. Caso de teste: Verificar o resultado da ordenação de cada algoritmo para números negativos:
   - testeArraySortResultadoNeg, testeInsertionSortResultadoNeg, testeBubbleSortDResultadoNeg.

Para executar os testes, ir em src > test > package > TestSistemaOrdenarDados. No IntelliJ, para executar os testes, é necessário apertar o símbolo de play (:arrow_forward:) da classe para executar todos os testes ou o símbolo de play de cada @Test para executar os testes individualmente.

### :woman: Autora
:link: https://github.com/MaMBassi

### :small_blue_diamond: Licença
MIT
