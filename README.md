# Design Patterns

Padr�es de projetos implementados em Java.

## Builder
Pode ser usado quando a classe tiver muitos atributos ou regras no construtor, facilitando e organizando a constru��o do objeto em uma nova classe, al�m de fornecer uma interface mais clara atrav�s dos m�todos encadeados (method chain).

> [Nota Fiscal](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/builder/nf)

## Chain of Responsability
O padr�o pode ser usado quando houver muitas condi��es, e diante de um encadeamento, o padr�o percorre essas condi��es at� encontrar uma que atenda a solicita��o. O Chain of Responsability separa as responsabilidades em classes pequenas e enxutas, e ainda prov� uma maneira flex�vel e desacoplada de juntar esses comportamentos novamente.

> [Tipo de retorno da requisi��o (XML, CSV, Porcento)](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/chain/request)

> [Calculador de Descontos](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/chain/descontos)

## Decorator
� recomendado o uso quando queremos compor comportamentos a outro comportamento de classes da mesma hierarquia. Isso pode ser definido no momento da instancia��o, atrav�s do construtor.

> [Impostos Compostos](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/decorator/impostos)

> [Filtro de Conta](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/decorator/filtro)

## Observer
Uma classe Subject � quem mant�m os dados compartilhados e uma lista de observadores que compartilham o dado. O Observer faz utiliza��o dos dados compartilhados e deve ser atualizado a cada modifica��o no Subject. Recomendado quando tiver v�rias a��es que compoem uma regra.

> [A��es ap�s gerar Nota Fiscal](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/observer/nf)

## State
Manter e organizar estados de uma forma simples, separados em classes da mesma hierarquia, abaixo de uma interface que define os m�todos que fazem a transi��o de estado.

> [Estado da Conta (Positivo/Negativo)](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/state/conta)

> [Estados de um or�amento](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/state/orcamentos)

## Strategy
Separa o que muda do que n�o muda em um software, de modo a evitar que o c�digo tenha propaga��o de mudan�as.
Oferece uma maneira flex�vel para escrever algoritmos e alternar entre eles com base no objeto passado no construtor, fazendo com que a regra fique encapsulada e o cliente n�o precise conhecer essas regras, apenas saber qual usar.

> [Impostos dos Funcion�rios](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/strategy/funcionarios)

> [Tipos de Investimentos](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/strategy/investimentos)

## Template Method
Fornece uma maneira abtra�da (template) de codificar uma regra baseada em uma interface, deixando as particularidades para as classes filhas que extenderem esse template.

> [Relat�rio simples e completo](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/template/relatorios)

> [M�xima e m�nima taxa��o de imposto](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/template/taxacao)
