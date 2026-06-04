public class Usuario {

    private String nome;
    private String cpf;
    private String email;
    private String cargo;
    private String login;
    private String senha;
    private String perfil;

    public Usuario(String nome, String cpf, String email, String cargo, String login, String senha, String perfil) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public void cadastrarUsuario() {
        System.out.println("Usuário cadastrado: " + nome);
    }

    public void editarUsuario(String novoEmail, String novoCargo, String novoPerfil) {
        this.email = novoEmail;
        this.cargo = novoCargo;
        this.perfil = novoPerfil;
        System.out.println("Usuário atualizado: " + nome);
    }

    public void excluirUsuario() {
        System.out.println("Usuário excluído: " + nome);
    }

    public void exibirUsuario() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Cargo: " + cargo);
        System.out.println("Login: " + login);
        System.out.println("Perfil: " + perfil);
    }
}
