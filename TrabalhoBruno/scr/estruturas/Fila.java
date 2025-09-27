package scr.estruturas;

public class Fila {

    private Documento[] docs;
    private int inicio;
    private int fim;
    private int qtd;

    public Fila(int capacidade) {
        docs = new Documento[capacidade];
        inicio = 0;
        fim = -1;
        qtd = 0;
    }

    public boolean vazia() {
        return qtd == 0;
    }

    public boolean cheia() {
        return qtd == docs.length;
    }

    public void enfileirar(Documento d) {

        if (!cheia()) {
            fim = (fim + 1) % docs.length;
            docs[fim] = d;
            qtd++;
        }
    }

    public Documento desenfileirar() {

        if (!vazia()) {
            Documento d = docs[inicio];
            inicio = (inicio + 1) % docs.length;
            qtd--;
            return d;
        }
        return null;
    }

    public int tamanho() {
        return qtd;
    }

    public void mostrar() {
        if (vazia()) {
            System.out.println("Fila vazia.");
            return;
        }

        System.out.print("Na fila: ");
        for (int i = 0; i < qtd; i++) {
            int pos = (inicio + i) % docs.length;
            System.out.print(docs[pos] + " | ");
        }
        System.out.println();
    }
}
