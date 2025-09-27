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

        System.out.println("\n Teste simples \n");
        editor.refazer();
        editor.desfazer();
        editor.inserir("Olá");
        editor.inserir(" Bruno");
        editor.desfazer();
        editor.refazer();
        editor.inserir("!!!");
        editor.desfazer();
        editor.refazer();
        editor.desfazer();
        editor.desfazer();
        editor.desfazer();

        System.out.println("\n Testando limite de historico \n");
        editor.inserir("1");
        editor.inserir("2");
        editor.inserir("3");
        editor.inserir("4");
        editor.inserir("5");
        editor.inserir("6");
        editor.inserir("7");
        editor.inserir("8");
        editor.inserir("9");
        editor.inserir("10");
        editor.inserir("nao deveria ser imprimido");
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
