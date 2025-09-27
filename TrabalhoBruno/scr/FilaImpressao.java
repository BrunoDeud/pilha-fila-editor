package scr;
public class FilaImpressao {
    private Fila fila;

    public FilaImpressao(int capacidade) {
        fila = new Fila(capacidade);
    }

    public void adicionar(Documento d) {
        fila.enfileirar(d);
        System.out.println("Adicionado: " + d);
    }

    public void imprimir() {
        Documento d = fila.desenfileirar();
        if (d != null) {
            System.out.println("Imprimindo -> " + d);
        } else {
            System.out.println("Nada para imprimir.");
        }
    }

    public void mostrarFila() {
        fila.mostrar();
    }

    public int total() {
        return fila.tamanho();
    }
}
