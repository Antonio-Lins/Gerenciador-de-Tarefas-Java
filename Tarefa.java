abstract class Tarefa {
    protected String descricao;
    protected boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public abstract void mostrarDetalhes();

    public String getDescricao() {
        return descricao;
    }
}
