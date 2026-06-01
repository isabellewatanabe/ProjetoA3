public class Projeto {

    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String status;
    private Usuario gerente;

    public Projeto(String nome, String descricao,
                   String dataInicio, String dataFim,
                   String status, Usuario gerente) {

        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.gerente = gerente;
    }

    public void exibirProjeto() {
        System.out.println("\nPROJETO");
        System.out.println("Nome: " + nome);
        System.out.println("Status: " + status);
        System.out.println("Gerente: " + gerente.getNome());
    }
}
