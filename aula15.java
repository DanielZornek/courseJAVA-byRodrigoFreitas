import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class aula15{
    public static void main(String[] args) throws IOException{
        // Ler, Criar, Deletar arquivos TXT
        Path path = Path.of("C:\\Programação\\Projetos\\courseJAVA-byRodrigoFreitas\\teste\\texto.txt");

        /* 
            Verificando se o arquivo não existe e escrevendo dentro dele:
        if(Files.notExists(path)){
            Files.createFile(path);
        }
        
        String texto = "Oi, tudo bem";

        Files.writeString(path, texto); */

        /* Lendo arquivos txt e imprimindo no console
        List<String> txt001 = Files.readAllLines(path);

        for(String linha: txt001){
            System.out.println(linha);
        }
        */

        // deletando arquivo
        Files.delete(path);
        if(Files.notExists(path)){
            System.out.println("Sumiu");
        }
    }
}