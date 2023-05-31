package Modulo16.padroesParteDois.adapter;

import java.io.File;

public interface PersistenciaArquivos {

    // byte[] bytes = Files.readAllBytes(file.toPath());
    public void gravar(File file);

    public File ler(String caminho);
    
}
