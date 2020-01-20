# Design Patterns

**Dicion�rio para consulta dos padr�es de projetos implementados em Java.**

### Chain of Responsability
*"Evitar o acoplamento do remetente de uma solicita��o ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar a solicita��o. Encadear os objetos receptores, passando a solicita��o ao longo da cadeia at� que um objeto a trate."*

**Exemplo:** Tipo de retorno da requisi��o (XML, CSV, Porcento) // Calculador de Descontos

O padr�o pode ser usado quando houver muitas condi��es para quando uma n�o for verdadeira, automaticamente tente a pr�xima. Com o Chain of Responsability fica mais elegante e enxuto o c�digo.
O padr�o Chain of Responsibility cai como uma luva quando temos uma lista de comandos a serem executados de acordo com algum cen�rio em espec�fico, e sabemos tamb�m qual o pr�ximo cen�rio que deve ser validado, caso o anterior n�o satisfa�a a condi��o.
Nesses casos, o Chain of Responsibility nos possibilita a separa��o de responsabilidades em classes pequenas e enxutas, e ainda prov� uma maneira flex�vel e desacoplada de juntar esses comportamentos novamente.
