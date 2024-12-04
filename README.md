# Gerenciador de Tarefas

## Descrição
o **gerenciador de tarefas** é uma aplicação em java que permite organizar e gerenciar atividades. com ele, o usuário pode criar, listar e concluir tarefas. o sistema suporta dois tipos de tarefas:

- **tarefa simples:** não possui prazo associado.  
- **tarefa com prazo:** inclui uma data limite para conclusão.  

este projeto utiliza conceitos fundamentais da programação orientada a objetos, como **herança**, **polimorfismo**, **classe abstrata**, **interface** e **sobrescrita de métodos da classe object**, garantindo uma arquitetura flexível e modular.

---

## Funcionalidades
- adicionar tarefas simples ou com prazo.  
- listar todas as tarefas, com detalhes como descrição, status e prazo (se aplicável).  
- marcar tarefas como concluídas.  
- navegar por um menu interativo no terminal.  

---

## Conceitos de Orientação a Objetos Aplicados
- **herança:**  
  - as classes `tarefasimples` e `tarefacomprazo` herdam de `tarefa`.  
- **polimorfismo:**  
  - o método `exibir()` é usado para exibir detalhes de tarefas, independentemente do tipo da tarefa.  
- **classe abstrata:**  
  - a classe `tarefa` serve como base para tarefas simples e com prazo, definindo atributos e métodos comuns.  
- **interface:**  
  - a interface `exibivel` garante que todas as tarefas tenham o método `exibir()`, padronizando a exibição.  
- **sobrescrita da classe object:**  
  - o método `tostring()` é sobrescrito nas classes para exibir informações detalhadas e personalizadas dos objetos.

---

## Estrutura do Projeto
a aplicação é composta pelas seguintes classes e interface:

- **interface:**  
  - `exibivel`: define o contrato para exibição das tarefas.  
- **classe abstrata:**  
  - `tarefa`: contém os atributos e métodos comuns a todos os tipos de tarefas.  
- **classes concretas:**  
  - `tarefasimples`: representa tarefas sem prazo.  
  - `tarefacomprazo`: adiciona um atributo para a data limite da tarefa.  
- **classe principal:**  
  - `gerenciadortarefas`: gerencia as tarefas criadas e controla a interação com o usuário via terminal.

---

## Como Executar

1. certifique-se de ter o **java 8** ou superior instalado no sistema.  
2. clone o repositório:  
   ```bash
   git clone https://github.com/Antonio-Lins/Gerenciador-de-Tarefas-Java.git
