# Design Patterns

Padrões de projetos implementados em Java.

## Chain of Responsability
*"Evitar o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar a solicitação. Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate."*

[**Exemplo:**](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/chain)
 Tipo de retorno da requisição (XML, CSV, Porcento) // Calculador de Descontos

O padrão pode ser usado quando houver muitas condições, e diante de um encadeamento, o padrão percorre essas condições até encontrar uma que atenda a solicitação. O Chain of Responsability separa as responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar esses comportamentos novamente.

