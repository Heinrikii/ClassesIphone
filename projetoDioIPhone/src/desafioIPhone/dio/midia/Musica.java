package desafioIPhone.dio.midia;

public class Musica implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Play Music");

    }

    @Override
    public void pausar() {
        System.out.println("Pausar Music");

    }

    @Override
    public void selecionar() {
        System.out.println("Select Music");

    }


}

