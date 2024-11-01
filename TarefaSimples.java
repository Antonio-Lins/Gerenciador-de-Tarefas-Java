class TarefaSimples extends Tarefa {

    public TarefaSimples(String descricao) {
        super(descricao);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Tarefa Simples: " + descricao + " [Concluída: " + concluida + "]");
    }
}
