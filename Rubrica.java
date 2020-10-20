import java.util.HashMap;

public class Rubrica {

    private HashMap<Integer, Persona> rubrica;


    public Rubrica(){
        rubrica = new HashMap<>();
    }

    public boolean add(Persona p){
        if(!rubrica.containsKey(p.getId())){
            rubrica.put(p.getId(), p);
            return true;
        }
        return false;
    }
}
