public class Projeto {

    private String nomeProjeto;
    private String descricao;
    private String dataInicio;
    private String dataTerminoPrevista;
    private String status;
    private String gerenteResponsavel;

    public Projeto(String nomeProjeto, String descricao, String dataInicio, String dataTerminoPrevista, String status, String gerenteResponsavel) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevista = dataTerminoPrevista;
        this.status = status;
        this.gerenteResponsavel = gerenteResponsavel;
    }

    public void cadastrarProjeto() {
        System.out.println("Projeto cadastrado: " + nomeProjeto);
    }

    public void editarProjeto(String novaDescricao, String novoStatus, String novaDataTerminoPrevista) {
        this.descricao = novaDescricao;
        this.status = novoStatus;
        this.dataTerminoPrevista = novaDataTerminoPrevista;
        System.out.println("Projeto atualizado: " + nomeProjeto);
    }

    public void excluirProjeto() {
        System.out.println("Projeto excluído: " + nomeProjeto);
    }

    public void exibirProjeto() {
        System.out.println("Projeto: " + nomeProjeto);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de início: " + dataInicio);
        System.out.println("Data de término prevista: " + dataTerminoPrevista);
        System.out.println("Status: " + status);
        System.out.println("Gerente responsável: " + gerenteResponsavel);
    }
}
