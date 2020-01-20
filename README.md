# Design Patterns

Dicionário para consulta dos padrões de projetos implementados em Java.

## Chain of Responsability
*"Evitar o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar a solicitação. Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate."*

[**Exemplo:**](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/chain)
 Tipo de retorno da requisição (XML, CSV, Porcento) // Calculador de Descontos

O padrão pode ser usado quando houver muitas condições e uma não sendo verdadeira, automaticamente ele tenta a próxima. O Chain of Responsability deixa mais elegante e enxuto o código e cai como uma luva quando temos uma lista de comandos a serem executados de acordo com algum cenário em específico, e sabemos também qual o próximo cenário que deve ser validado, caso o anterior não satisfaça a condição.
Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar esses comportamentos novamente.

