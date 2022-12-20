package desafioIPhone.dio.internet;

public class Safari implements Internet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página Safari");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Página Safari");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página Safari");

    }


}