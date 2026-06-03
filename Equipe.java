public class Equipe {

    private String nomeEquipe;
    private String descricao;
    private String[] membros;

    public Equipe(String nomeEquipe, String descricao, String[] membros) {
        this.nomeEquipe = nomeEquipe;
        this.descricao = descricao;
        this.membros = membros;
    }

    public void cadastrarEquipe() {
        System.out.println("Equipe cadastrada: " + nomeEquipe);
    }

    public void editarEquipe(String novaDescricao) {
        this.descricao = novaDescricao;
        System.out.println("Equipe atualizada: " + nomeEquipe);
    }

    public void excluirEquipe() {
        System.out.println("Equipe excluída: " + nomeEquipe);
    }

    public void exibirEquipe() {
        System.out.println("Equipe: " + nomeEquipe);
        System.out.println("Descrição: " + descricao);
        System.out.println("Membros:");

        for (String membro : membros) {
            System.out.println("- " + membro);
        }
    }
}
