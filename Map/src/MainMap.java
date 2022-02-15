import java.util.HashMap;
import java.util.Map;

public class MainMap {

    HashMap<String,String> glossaire = new HashMap<>();

    public MainMap(){

        glossaire.put("sous classe", "Classe heritant d'une autre classe");
        glossaire.put("methode", "une fonction destinatrice d'un message");
        glossaire.put("classe derivee", "Classe heritant d'une autre classe");

        for (Map.Entry<String, String> entry : glossaire.entrySet())
        {
            System.out.println(entry.getKey() );
        }
    }
    public static void main(String[] args) {  new MainMap(); }
}
