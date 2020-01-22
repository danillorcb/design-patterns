# Design Patterns

Padrões de projetos implementados em Java.

## Builder
Pode ser usado quando a classe tiver muitos atributos ou regras no construtor, facilitando e organizando a construção do objeto em uma nova classe, além de fornecer uma interface mais clara através dos métodos encadeados (method chain).

> [Nota Fiscal](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/builder/nf)

## Chain of Responsability
O padrão pode ser usado quando houver muitas condições, e diante de um encadeamento, o padrão percorre essas condições até encontrar uma que atenda a solicitação. O Chain of Responsability separa as responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar esses comportamentos novamente.

> [Tipo de retorno da requisição (XML, CSV, Porcento)](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/chain/request)

> [Calculador de Descontos](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/chain/descontos)

## Decorator
É recomendado o uso quando queremos compor comportamentos a outro comportamento de classes da mesma hierarquia. Isso pode ser definido no momento da instanciação, através do construtor.

> [Impostos Compostos](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/decorator/impostos)

> [Filtro de Conta](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/decorator/filtro)

## State
Manter e organizar estados de uma forma simples, separados em classes da mesma hierarquia, abaixo de uma interface que define os métodos que fazem a transição de estado.

> [Estado da Conta (Positivo/Negativo)](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/state/conta)

> [Estados de um orçamento](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/state/orcamentos)