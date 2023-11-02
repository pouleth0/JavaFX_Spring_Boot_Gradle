package br.com.studproject.gestorcontab;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class StartJavaFX {
    public static void main(String[] args) {
        // Obtém o caminho do diretório atual
        String currentDirectory = System.getProperty("user.dir");

        // Constrói o caminho para o diretório 'lib' no diretório atual
        String libDirectory = currentDirectory + File.separator + "lib";

        // Configura o classpath para incluir as bibliotecas do diretório 'lib'
        URLClassLoader classLoader = null;
        try {
            classLoader = new URLClassLoader(new URL[] {
                    new File(libDirectory).toURI().toURL()
            }, StartJavaFX.class.getClassLoader());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        // Define o novo classloader
        Thread.currentThread().setContextClassLoader(classLoader);

        // Agora você



        GestorContabApplication.main(args);

    }
}
/*
    URLClassLoader classLoader = null;
        try {
                classLoader = new URLClassLoader(new URL[] {
                new URL("file:///caminho/para/o/projeto/lib/"),
                // Adicione outras bibliotecas aqui, se necessário
                }, StartJavaFX.class.getClassLoader());
        } catch (MalformedURLException e) {
        throw new RuntimeException(e);
        }*/
