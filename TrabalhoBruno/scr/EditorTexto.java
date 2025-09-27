package scr;
public class EditorTexto {
    
    private Pilha desfazer;
    private Pilha refazer;
    private String texto;

    public EditorTexto(int limite) {
        desfazer = new Pilha(limite);
        refazer = new Pilha(limite);
        texto = "";
    }

    public void inserir(String novo) {
        desfazer.empilhar(texto);
        refazer.limpar();
        texto += novo;
        System.out.println("Texto atual: \"" + texto + "\"");
    }

    public void desfazer() {
        String anterior = desfazer.desempilhar();
        if (anterior != null) {
            refazer.empilhar(texto);
            texto = anterior;
            System.out.println("Desfazer -> \"" + texto + "\"");
        } else {
            System.out.println("Nada para desfazer.");
        }
    }

    public void refazer() {
        String futuro = refazer.desempilhar();
        if (futuro != null) {
            desfazer.empilhar(texto);
            texto = futuro;
            System.out.println("Refazer -> \"" + texto + "\"");
        } else {
            System.out.println("Nada para refazer.");
        }
    }
}
