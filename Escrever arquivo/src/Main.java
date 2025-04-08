import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Mudar o nome do "usuario" (colocar o nome do usuário do seu dispositivo).
        String filePath = "C:\\Users\\usuario\\Desktop\\text.txt";
        // String textContent = "Eu gosto de pizza!\nÉ muito bom!\nMe compre pizza!";
        String textContent = """
                Roses are Red
                Violets are Blue
                BOOTY BOOTY BOOTY
                ROCKIN' EVERYWHERE
                """;

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("O arquivo foi escrito");
        } catch(FileNotFoundException e) {
            System.out.println("Não conseguiu achar a localização do arquivo");
        }
        catch(IOException e) {
            System.out.println("Não conseguiu escrever o arquivo");
        }
    }
}