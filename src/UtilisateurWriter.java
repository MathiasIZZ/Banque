import java.io.*;
import java.net.UnknownServiceException;
import java.util.*;

public class UtilisateurWriter {


    public static void writerUtilisateur(String unNomDeFichier, List<String> desNoms, List<String> desPrenoms, int combien) throws IOException {

        StringBuilder usersToSave = new StringBuilder();
        String[] s = {"Mr", "Mme"};
        BufferedWriter bufferedWriter = null;

        Random rand = new Random();

        for (int i = 0; i < combien; i++) {

            int sRandom = rand.nextInt(2);
            Collections.shuffle(desPrenoms);
            Collections.shuffle(desNoms);

            usersToSave.append(i + ";");
            usersToSave.append(s[sRandom] + ";");
            usersToSave.append(desNoms.get(i).trim() + ";");
            usersToSave.append(desPrenoms.get(i).trim() + ";");
            usersToSave.append("/n");
        }

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(unNomDeFichier));
            bufferedWriter.write(usersToSave.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }


    }


}
