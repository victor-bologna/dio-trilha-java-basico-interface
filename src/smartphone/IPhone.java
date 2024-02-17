package smartphone;

import smartphone.componentes.Internet;
import smartphone.componentes.Musica;
import smartphone.componentes.Telefone;

public class IPhone implements Internet, Musica, Telefone {

    @Override
    public void navegarInternet() {
        System.out.println("Abrindo navegador da internet");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Maria Gadu.");
    }

    @Override
    public void pararMusica() {
        System.out.println("Toque aqui para continuar reproduzindo.");
    }

    @Override
    public void proxMusica() {
        System.out.println("Tocando proxima música.");
    }

    @Override
    public void musicaAnterior() {
        System.out.println("Tocando música anterior.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para contato x.");
    }
}
