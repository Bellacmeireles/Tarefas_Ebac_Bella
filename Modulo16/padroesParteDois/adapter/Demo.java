package Modulo16.padroesParteDois.adapter;

import java.io.File;

public class Demo {
    public static void main(String args[]) {
        String file = "teste.txt";
        DropBox drop = new DropBox();
        PersistenciaArquivos arquivos = new DropBoxAdapter(drop);
        arquivos.gravar(new File(file));
    }
}
