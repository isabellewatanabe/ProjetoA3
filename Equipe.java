public class Equipe {

    private String nome;
    private String descricao;
    private int quantidadeMembros;

    public Equipe(String nome,
                  String descricao,
                  int quantidadeMembros) {

        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeMembros = quantidadeMembros;
    }

    public void exibirEquipe() {
        System.out.println("Equipe: " + nome);
        System.out.println("Membros: " + quantidadeMembros);
    }
}
