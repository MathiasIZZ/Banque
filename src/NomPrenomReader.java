import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NomPrenomReader {


    public static List<String> readFichier(String nomFichier) throws IOException {
        BufferedReader bufferedReader = null;

        List<String> result = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(nomFichier));
            String ligne = null;
            while((ligne = bufferedReader.readLine()) != null) {
                result.add(ligne);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        return result;
    }

    public static List<String> readNom() throws IOException {

        return NomPrenomReader.readFichier("./filereader/nom.txt");
    }

    public static List<String> readPrenom() throws IOException {

        return NomPrenomReader.readFichier("./filereader/prenom.txt");
    }






}
