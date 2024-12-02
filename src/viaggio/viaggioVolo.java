package viaggio;

public class viaggioVolo extends Viaggi{
    private  boolean andataRitorno;

    public viaggioVolo(String destinazione, int durata, double costo, boolean andataRitorno){
        super(destinazione,  durata, costo);
        this.andataRitorno=andataRitorno;
    }

    public boolean GetAndataRitorno() {
        return andataRitorno;
    }

    public void setAndataRitorno(boolean andataRitorno) {
        this.andataRitorno = andataRitorno;
    }
}
