# Entendendo Algoritmo
Para justificar o quanto um algoritmo é lento será utilizado a notação Big O, que analisa a quantidade de operações
que são realizadas, conforme os elementos que são analisados aumentam.


| binary search | selection sort | pesquisa simples | lista encadeada simples|
|---------------|----------------|------------------|------------------------|
| O log(n)      |    O(n x n)    |        O(n)      |         O(n)          |

--------------

## Busca Binária com Array
A cada interação ocorre a separação dos elementos do array em duas partes menor e maior,
sendo o elemento a ser buscado maior do que a outra metade do array é possível descartar a metade menor 
e olhar somente para outra metade e isso é feito ate que se ache o elemento no array ou que se verifique
que o elemento não existe no array.

### Pré-requisito
Os elementos devem estar ordenados.

## Busca Linear com Array
Ocorre a comparação do item a ser buscado com todos os elementos do array.

### Pré-requisito
Paciência.

## Ordenar Elementos
Podemos organizar números, por exemplo, em ordem crescente ou decrescente e palavras em ordem alfabética.
Então ordenar elementos consiste em organiza-los em uma ordem estabelecida, para isto todos os elementos 
precisam ser do mesmo tipo.

### Ordenação por Seleção(Selection Sort)
A cada interação seleciona-se o menor elemento dentro do array e coloca-se mais a esquerda possível,
se for a primeira interação será no índice 0, 1 e assim por diante.
Não é indicado para ser utilizado em projetos reais, por ser muito lento,
é utilizado somente como estudo pela sua simplicidade de implementar.

### Lista Encadeada Simples
Acessar um elemento em um array é muito mais rápido do que em uma lista encadeada, primeiro porque
o array contem índices e segundo porque os elementos são armazenados juntos, um do lado do outro 
na memória. Na lista encadeada os elementos ficam espalhados pela memória e cada elemento sabe
apenas quem é o seu próximo ou se não existe próximo elemento, o que torna a sua inserção
mais rápido e a sua busca mais lenta.