import java.time.LocalDate;

class TarefaComPrazo extends Tarefa {
    private LocalDate prazo;

    public TarefaComPrazo(String descricao, LocalDate prazo) {
        super(descricao);
        this.prazo = prazo;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Tarefa com Prazo: " + descricao + " [Concluída: " + concluida + ", Prazo: " + prazo + "]");
    }
}
