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

## Observer
Uma classe Subject é quem mantém os dados compartilhados e uma lista de observadores que compartilham o dado. O Observer faz utilização dos dados compartilhados e deve ser atualizado a cada modificação no Subject. Recomendado quando tiver várias ações que compoem uma regra.

> [Ações após gerar Nota Fiscal](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/observer/nf)

## State
Manter e organizar estados de uma forma simples, separados em classes da mesma hierarquia, abaixo de uma interface que define os métodos que fazem a transição de estado.

> [Estado da Conta (Positivo/Negativo)](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/state/conta)

> [Estados de um orçamento](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/state/orcamentos)

## Strategy
Separa o que muda do que não muda em um software, de modo a evitar que o código tenha propagação de mudanças.
Oferece uma maneira flexível para escrever algoritmos e alternar entre eles com base no objeto passado no construtor, fazendo com que a regra fique encapsulada e o cliente não precise conhecer essas regras, apenas saber qual usar.

> [Impostos dos Funcionários](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/strategy/funcionarios)

> [Tipos de Investimentos](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/strategy/investimentos)

## Template Method
Fornece uma maneira abtraída (template) de codificar uma regra baseada em uma interface, deixando as particularidades para as classes filhas que extenderem esse template.

> [Relatório simples e completo](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/template/relatorios)

> [Máxima e mínima taxação de imposto](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/template/taxacao)
