package scr;

import scr.estruturas.Documento;
import scr.estruturas.EditorTexto;
import scr.estruturas.FilaImpressao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste: Editor de textos \n");
        testarEditorDeTexto();
        System.out.println("\n Proximo Teste: Fila de impressão \n");
        testarFilaDeImpressao();
    }

    public static void testarEditorDeTexto() {
        EditorTexto editor = new EditorTexto(10);

        editor.refazer();
        editor.inserir("Olá");
        editor.inserir(" Bruno");
        editor.desfazer();
        editor.inserir(" Bruno");
        editor.refazer();
        editor.inserir("!!!");
        editor.desfazer();
        editor.refazer();
        editor.desfazer();
        editor.desfazer();
        editor.desfazer();
        editor.desfazer();
        editor.inserir("texto");
        editor.inserir("texto");
        editor.inserir("texto");
        editor.inserir("texto");
        editor.inserir("texto");
        editor.inserir("texto");
        editor.inserir("texto");
        editor.inserir("texto");
        editor.inserir("texto");
        editor.inserir("texto");
        editor.inserir("texto");
    }

    public static void testarFilaDeImpressao() {
        FilaImpressao impressora = new FilaImpressao(10);

        impressora.adicionar(new Documento("Aula", 200));
        impressora.adicionar(new Documento("Trabalho", 1500));
        impressora.adicionar(new Documento("Bruno", 300));

        System.out.println("\nImprimindo \n");

        impressora.mostrarFila();
        System.out.println("Total na fila: " + impressora.total());

        impressora.imprimir();
        impressora.mostrarFila();

        impressora.imprimir();
        impressora.mostrarFila();

        impressora.imprimir();
        impressora.imprimir();
        impressora.mostrarFila();

        System.out.println("Restantes: " + impressora.total());
    }
}
