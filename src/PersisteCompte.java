import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersisteCompte {

    private static String path = "./compte-clients";

    public static void createFolder(String nom, String prenom){

        String directoryName = path.concat(nom + "-" + prenom);

        File dir = new File(directoryName);

        // MAKE DIRECTORY
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }

    public static void createCompte(Client client, int compteId){

        String directoryName = path.concat(client.getNom() + "-" + client.getPrenom()).concat("/" + client.getCompte(compteId).getNumero()).concat(".csv");

        File fileCompte = new File(directoryName);



        try {
            FileWriter fw = new FileWriter(fileCompte.getAbsoluteFile());
            fw.write("");
            fw.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }


}
