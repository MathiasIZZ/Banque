package exceptions;

public class ProblemeCompteException extends Exception{



    // on peut surcharger un constructeur en l'extendant de Exception
    public ProblemeCompteException(String message) {
        super(message);
    }
}
