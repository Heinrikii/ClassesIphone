package desafioIPhone.dio.internet;

public class Chrome implements Internet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página Chrome");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba Chrome");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página Chrome");

    }



}
