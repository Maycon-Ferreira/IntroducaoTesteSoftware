# Resolução da Primeira Lista de Exercícios

## 1 Exercícios (Teoria)
### 1.1
O defeito é um problema estático no código, normalmente se manifesta por uma lógica errada do programador, enquanto a falha pode ser consequência deste defeito, que causa um estado erroneo e ele se manifesta gerando uma saída diferente da esperada.
### 1.2
O teste serve para que seja feita uma avaliação do software por meio da sua execução e de sua saída, onde são encontradas falhas e então ao processo de depuração para encontrar e eliminar defeitos.
### 1.3
Não, pois não se pode testar todo seu domínio de entradas.

## 2 Exercícios (Prática)
### 2.1
#### a)
Método implementado em ex2_1.Union.union(a, b).
#### b)
- A assinatura deixa a interpretar que a função deve fazer uma união (que resulta em um conjunto) mas recebe e retorna listas (que pode conter elementos repetidos);
- Não é especificado como lidar se _a_ ou _b_ forem _null_, o que pode levar a _NullPointerException_ indesejados;
- Não é especificado como lidar se _a_ ou _b_ contém _null_, o que pode levar a _NullPointerException_ indesejados.
#### c)
Testes implementados na classe ex2_1.UnionTest.
#### d)
Método implementado na classe ex2_1.UnionFixed(a, b) e exemplos de uso em ex2_1.UnionTest.

### 2.2 CountPositive
#### a)
Com o caso de teste e a saída esperada dada, verifica-se a intenção de não contar 0 como positivo, que é um defeito do código.
#### b)
x = null e x = [] pois o método não irá executar o código dentro do loop onde se encontra o defeito.
#### c)
Qualquer vetor que não contém 0, ex.: x = [1, 2, 3], saída esperada = 3, saída = 3.
#### d)
Não existe caso de teste em que o erro não se propague para a saída, porque o estado é sempre retornado quando um erro ocorre.
#### e)
x = [-4, 2, 0, 2], i = 2, x[i] = 0, count = 1, PC = linha 15.

### 2.2 OddOrPos
#### a)
Ímpares negativos não são contabilizados corretamente.
#### b)
x = null e x = [] pois o método não irá executar o código dentro do loop onde se encontra o defeito.
#### c)
Qualquer vetor que não contém ímpares negativos, ex.: x = [-4, -2, 0, 1, 2], saída esperada = 3, saída = 3.
#### d)
Não existe caso de teste em que o erro não se propague para a saída, porque o estado é sempre retornado quando um erro ocorre.
#### e)
x = [-3, -2, 0, 1, 4], i = 0, x[i] = -3, count = 0, PC = linha 15.