# Sistema de Pedidos de Lanchonete

Projeto acadêmico de Análise e Projeto de Sistemas II, desenvolvido em equipe de três integrantes. A apresentação está prevista para 18/11/2026.

## Objetivo e funcionalidades previstas

O projeto tem como objetivo aplicar o padrão Abstract Factory e os princípios SOLID a um sistema de pedidos por console. O usuário poderá adicionar ao carrinho combos tradicionais (hambúrguer de carne e refrigerante) ou veganos (hambúrguer vegetal e suco natural), consultar o valor total e finalizar o pedido.

O repositório contém a estrutura inicial do projeto. A implementação das funcionalidades e a validação dos princípios SOLID estão pendentes.

## Tecnologias

- Java com o JDK configurado no Eclipse IDE.
- Console do Eclipse para entrada e saída de dados.
- Git e GitHub para controle de versão e colaboração.

O projeto será compilado pelo Eclipse e funcionará sem banco de dados, interface gráfica ou frameworks externos.

## Abstract Factory

Cada fábrica concreta será responsável por criar os produtos de uma família. A fábrica tradicional fornecerá hambúrguer de carne e refrigerante. A fábrica vegana fornecerá hambúrguer vegetal e suco natural. O sistema de pedidos poderá trabalhar com as abstrações dos produtos e trocar a família escolhendo outra fábrica.

O Factory Method encapsula a criação de um produto por meio de um método cujo tipo concreto pode ser definido por subclasses. Seria aplicável à criação de cada produto individual. A Abstract Factory agrupa as operações de criação de hambúrguer e bebida para manter os dois itens na mesma família. Builder seria uma opção caso o foco fosse montar um combo personalizável em etapas.

## Princípios SOLID considerados

- **Responsabilidade única (SRP)** — atribuir responsabilidades distintas aos produtos, às fábricas, ao carrinho e à interação pelo console.
- **Aberto/fechado (OCP)** — permitir a inclusão de novas famílias por meio de novas fábricas e produtos, reaproveitando a lógica de montagem e do carrinho.
- **Substituição de Liskov (LSP)** — garantir que diferentes hambúrgueres, bebidas e fábricas respeitem os contratos de suas abstrações.
- **Segregação de interfaces (ISP)** — definir contratos específicos para hambúrgueres e bebidas, com as operações que cada tipo precisa oferecer.
- **Inversão de dependência (DIP)** — usar as abstrações de fábricas e produtos na lógica de montagem dos combos.

## Importação e execução no Eclipse

1. No Eclipse, abra **File → Import → General → Existing Projects into Workspace**.
2. Em **Select root directory**, selecione a pasta que contém o arquivo .project. Marque **lanchonete-abstract-factory** e clique em **Finish**.
3. Em **Window → Preferences → Java → Installed JREs**, confirme que há um JDK configurado. O projeto utiliza o JDK padrão do workspace.
4. Quando Main.java estiver implementado em src/, clique nele com o botão direito e selecione **Run As → Java Application**. Use a aba **Console** para interagir com o programa.
