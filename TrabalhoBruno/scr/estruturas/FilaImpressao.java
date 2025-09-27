package scr.estruturas;

public class FilaImpressao {
    private Fila fila;

    public FilaImpressao(int capacidade) {
        fila = new Fila(capacidade);
    }

    public void adicionar(Documento doc) {
        fila.enfileirar(doc);
        System.out.println("Adicionado: " + doc);
    }

    public void imprimir() {
        Documento doc = fila.desenfileirar();
        if (doc != null) {
            System.out.println("\nImprimindo:  " + doc + "\n");
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
