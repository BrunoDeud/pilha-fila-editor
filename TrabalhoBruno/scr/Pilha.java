package scr;
public class Pilha {
    
    private String[] itens;
    private int topo;

    public Pilha(int capacidade) {
        itens = new String[capacidade];
        topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == itens.length - 1;
    }

    public void empilhar(String valor) {
        if (!estaCheia()) {
            itens[++topo] = valor;
        }
    }

    public String desempilhar() {
        if (!estaVazia()) {
            return itens[topo--];
        }
        return null;
    }

    public void limpar() {
        topo = -1;
    }
}
