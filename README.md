# Design Patterns

Padr�es de projetos implementados em Java.

## Chain of Responsability
*"Evitar o acoplamento do remetente de uma solicita��o ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar a solicita��o. Encadear os objetos receptores, passando a solicita��o ao longo da cadeia at� que um objeto a trate."*

[**Exemplo:**](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/chain)
 Tipo de retorno da requisi��o (XML, CSV, Porcento) // Calculador de Descontos

O padr�o pode ser usado quando houver muitas condi��es, e diante de um encadeamento, o padr�o percorre essas condi��es at� encontrar uma que atenda a solicita��o. O Chain of Responsability separa as responsabilidades em classes pequenas e enxutas, e ainda prov� uma maneira flex�vel e desacoplada de juntar esses comportamentos novamente.

