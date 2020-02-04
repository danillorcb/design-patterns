# Design Patterns

Padrões de projetos implementados em Java.

## Builder
Pode ser usado quando a classe tiver muitos atributos ou regras no construtor, facilitando e organizando a construção do objeto em uma nova classe, além de fornecer uma interface mais clara através dos métodos encadeados (method chain).

> [Nota Fiscal](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/builder/nf)

## Chain of Responsability
O padrão pode ser usado quando houver muitas condições, e diante de um encadeamento, o padrão percorre essas condições até encontrar uma que atenda a solicitação. O Chain of Responsability separa as responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar esses comportamentos novamente.

> [Tipo de retorno da requisição (XML, CSV, Porcento)](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/chain/request)

> [Calculador de Descontos](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/chain/descontos)

## Command
Pode ser usado quando queremos colocar em fila a execução de vários comandos de um objeto, fazendo com que esses comandos possam ser executados dinamicamente. Outro uso seria uma espécie de transação, onde a sequência de comandos só seria validada ou não, quando fossem executados métodos de rollback ou commit, por exemplo.

> [Status de um pedido](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/command/pedido)

## Decorator
É recomendado o uso quando queremos compor comportamentos a outro comportamento de classes da mesma hierarquia. Isso pode ser definido no momento da instanciação, através do construtor.

> [Impostos Compostos](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/decorator/impostos)

> [Filtro de Conta](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/decorator/filtro)

## Factory
Facilitar a criação de objetos que são complicados. Geralmente é um objeto que não precisa de parâmetros externos a ele para ser criado, a Factory já se encarrega de tudo que precisa para criação e te fornecer o objeto.

> [Connection](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/factory/db)

## Flyweight
Quando temos uma grande quantidade de objetos similares a serem instanciados repetidamente, é ideal que uma classe seja responsável por esse controle, fazendo cache das instâncias para reuso. 

> [Notas Musicais](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/flyweight/musica)

## Interpreter
Usado quando temos expressões que devem ser avaliadas, e a transformadas em uma estrutura de dados, para depois fazer com que a própria árvore se avalie.

> [Expressão Matemática](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/interpreter/expressao)

## Memento
O padrão faz com que os estados de um objeto sejam mantidos em uma lista/histórico/memória, para futura consulta e restauração dos estados anteriores. Com ele é possível fazer o famoso Ctrl+Z no objeto.

> [Histórico dos estados de um contrato](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/memento/contrato)

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

## Visitor
É usado quando precisamos navegar sobre uma árvore de maneira organizada, realizando alguma tarefa.

> [Imprimindo a Expressão Matemática](https://github.com/danillorcb/design-patterns/tree/master/src/br/com/danillorcb/pattern/visitor/expressao)