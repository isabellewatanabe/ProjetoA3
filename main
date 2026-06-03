public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(
                "Isabelle Watanabe",
                "00000000000",
                "isabelle@email.com",
                "Administrador",
                "Isabelle.Watanabe",
                "123456",
                "Administrador"
        );

        Usuario usuario2 = new Usuario(
                "Pedro Kavano",
                "11111111111",
                "pedro@email.com",
                "Gerente",
                "Pedro.Kavano",
                "123456",
                "Gerente"
        );

        Usuario usuario3 = new Usuario(
                "Francisco Mion",
                "22222222222",
                "francisco@email.com",
                "Colaborador",
                "Francisco.Mion",
                "123456",
                "Colaborador"
        );

        Usuario usuario4 = new Usuario(
                "Casimiro Miau",
                "33333333333",
                "casimiro@email.com",
                "Colaborador",
                "Casimiro.Miau",
                "123456",
                "Colaborador"
        );

        String[] membros = {
                "Isabelle Watanabe",
                "Pedro Kavano",
                "Francisco Mion",
                "Casimiro Miau"
        };

        Projeto projeto = new Projeto(
                "Projeto A3",
                "Sistema para organização de usuários, equipes e projetos",
                "31/05/2026",
                "04/06/2026",
                "Em desenvolvimento",
                "Pedro Kavano"
        );

        Equipe equipe = new Equipe(
                "Equipe Projeto A3",
                "Equipe responsável pelo desenvolvimento do Projeto A3",
                membros
        );

        usuario1.cadastrarUsuario();
        usuario2.cadastrarUsuario();
        usuario3.cadastrarUsuario();
        usuario4.cadastrarUsuario();
        projeto.cadastrarProjeto();
        equipe.cadastrarEquipe();

        System.out.println();

        usuario1.exibirUsuario();
        System.out.println();

        usuario2.exibirUsuario();
        System.out.println();

        usuario3.exibirUsuario();
        System.out.println();

        usuario4.exibirUsuario();
        System.out.println();

        projeto.exibirProjeto();
        System.out.println();

        equipe.exibirEquipe();
    }
}
