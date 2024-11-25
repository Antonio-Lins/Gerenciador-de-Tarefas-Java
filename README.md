Gerenciador de Tarefas
Descrição
O Gerenciador de Tarefas é uma aplicação em Java para organizar e gerenciar tarefas, permitindo ao usuário criar, listar e concluir atividades. O projeto suporta dois tipos de tarefas:

Tarefa Simples: Sem prazo associado.
Tarefa com Prazo: Inclui uma data limite para conclusão.
O sistema utiliza conceitos de orientação a objetos, como Herança, Polimorfismo, Classe Abstrata, Interface e Sobrescrita da Classe Object, para demonstrar uma arquitetura modular e escalável.

Funcionalidades
Adicionar tarefas simples ou com prazo.
Listar todas as tarefas, exibindo detalhes como descrição, status e prazo (se aplicável).
Marcar tarefas como concluídas.
Navegar por um menu interativo no terminal.
Conceitos de Orientação a Objetos Aplicados
Herança:
Classes TarefaSimples e TarefaComPrazo herdam de Tarefa.
Polimorfismo:
Uso do método exibir() para exibir detalhes de tarefas, independente do tipo.
Classe Abstrata:
Tarefa define a estrutura comum para diferentes tipos de tarefas.
Interface:
A interface Exibivel é implementada para garantir que os objetos possam ser exibidos.
Sobrescrita da Classe Object:
toString() é sobrescrito em cada classe para personalizar a exibição de objetos.
Estrutura do Projeto
Interface:
Exibivel: Define o método exibir().
Classe Abstrata:
Tarefa: Classe base com atributos e métodos comuns.
Classes Concretas:
TarefaSimples: Representa tarefas sem prazo.
TarefaComPrazo: Adiciona um atributo de prazo (LocalDate).
Classe Principal:
GerenciadorTarefas: Gerencia a lista de tarefas e implementa a interação com o usuário.
Como Executar
Certifique-se de ter o Java 8 ou superior instalado.
Clone o repositório:
bash
Copiar código
git clone https://github.com/SEU_USUARIO/gerenciador-de-tarefas.git
Compile o código:
bash
Copiar código
javac *.java
Execute o programa:
bash
Copiar código
java GerenciadorTarefas
Exemplo de Uso
Adicione uma tarefa simples com a opção 1.
Adicione uma tarefa com prazo com a opção 2.
Liste todas as tarefas com a opção 3.
Marque uma tarefa como concluída com a opção 4.
Estrutura do Código
text
Copiar código
gerenciador-de-tarefas/
├── Exibivel.java
├── Tarefa.java
├── TarefaSimples.java
├── TarefaComPrazo.java
└── GerenciadorTarefas.java
Licença
Este projeto é licenciado sob a Licença MIT. Consulte o arquivo LICENSE para mais detalhes.
