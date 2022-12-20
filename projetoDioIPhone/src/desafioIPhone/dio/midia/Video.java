package desafioIPhone.dio.midia;

public class Video implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Play Video");

    }

    @Override
    public void pausar() {
        System.out.println("Pausar Video");

    }

    @Override
    public void selecionar() {
        System.out.println("Select Video");

    }


}

