package scr;
public class Main {
    public static void main(String[] args) {

        // Editor de Texto
        System.out.println("= Editor de Texto =");
        EditorTexto editor = new EditorTexto(10);

        editor.inserir("Olá");
        editor.inserir(" Bruno");
        editor.desfazer();
        editor.refazer();
        editor.inserir("!!!");
        editor.desfazer();
        editor.desfazer();

        // Fila de Impressão
        System.out.println("= Fila de Impressão =");
        FilaImpressao impressora = new FilaImpressao(10);

        impressora.adicionar(new Documento("Aula", 200));
        impressora.adicionar(new Documento("Trabalho", 1500));
        impressora.adicionar(new Documento("Bruno", 300));

        impressora.mostrarFila();
        System.out.println("Total na fila: " + impressora.total());

        impressora.imprimir();
        impressora.mostrarFila();

        impressora.imprimir();
        impressora.mostrarFila();

        System.out.println("Restantes: " + impressora.total());
    }
}
