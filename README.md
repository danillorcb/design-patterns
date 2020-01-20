# Design Patterns

Dicion�rio para consulta dos padr�es de projetos implementados em Java.

## Chain of Responsability
*"Evitar o acoplamento do remetente de uma solicita��o ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar a solicita��o. Encadear os objetos receptores, passando a solicita��o ao longo da cadeia at� que um objeto a trate."*

[**Exemplo:**](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/chain)
 Tipo de retorno da requisi��o (XML, CSV, Porcento) // Calculador de Descontos

O padr�o pode ser usado quando houver muitas condi��es e uma n�o sendo verdadeira, automaticamente ele tenta a pr�xima. O Chain of Responsability deixa mais elegante e enxuto o c�digo e cai como uma luva quando temos uma lista de comandos a serem executados de acordo com algum cen�rio em espec�fico, e sabemos tamb�m qual o pr�ximo cen�rio que deve ser validado, caso o anterior n�o satisfa�a a condi��o.
Nesses casos, o Chain of Responsibility nos possibilita a separa��o de responsabilidades em classes pequenas e enxutas, e ainda prov� uma maneira flex�vel e desacoplada de juntar esses comportamentos novamente.

