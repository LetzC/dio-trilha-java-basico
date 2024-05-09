import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  // Atributo
  private List<Tarefa> tarefaList;

  // Construtor
  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  // Método
  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }

  public void removeTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa tarefa : tarefaList) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(tarefa);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalDeTarefas() {
    return tarefaList.size();
  }

  public void obterDescricoesTarefas() {
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();

    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 2");

    System.out.println(listaTarefa.obterNumeroTotalDeTarefas());

    listaTarefa.removeTarefa("Tarefa 2");

    System.out.println(listaTarefa.obterNumeroTotalDeTarefas());

    listaTarefa.obterDescricoesTarefas();
  }
}