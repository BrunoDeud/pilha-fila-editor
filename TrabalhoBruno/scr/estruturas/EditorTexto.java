package scr.estruturas;

public class EditorTexto {

    private Pilha historico;
    private Pilha refazer;
    private String texto;

    public EditorTexto(int limite) {
        historico = new Pilha(limite);
        refazer = new Pilha(limite);
        texto = "";
    }

    // metodo para inserir um novo valor
    public void inserir(String novo) {
        // Verifica se a pilha esta cheia
        if (!historico.estaCheia()) {
            historico.empilhar(texto);
            refazer.limpar();
            texto += novo;
            System.out.println("Texto atual: " + texto);
        } else {
            System.out.println("Não é possível inserir. Limite do histórico atingido!");
        }
    }

    // metodo para desfazer o ultimo valor inserido
    public void desfazer() {
        String anterior = historico.desempilhar();
        // verifica se existe algum valor para ser desfeito
        if (anterior != null) {
            refazer.empilhar(texto);
            texto = anterior;
            System.out.println("Desfazer: " + texto);
        } else {
            System.out.println("Nada para desfazer.");
        }
    }

    // metodo para refazer o ultimo valor desfeito
    public void refazer() {
        String futuro = refazer.desempilhar();
        if (futuro != null) {
            historico.empilhar(texto);
            texto = futuro;
            System.out.println("Refazer: " + texto);
        } else {
            System.out.println("Nada para refazer.");
        }
    }
}