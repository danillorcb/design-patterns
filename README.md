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

## State
Manter e organizar estados de uma forma simples, separados em classes da mesma hierarquia, abaixo de uma interface que define os m�todos que fazem a transi��o de estado.

> [Estado da Conta (Positivo/Negativo)](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/state/conta)

> [Estados de um or�amento](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/state/orcamentos)