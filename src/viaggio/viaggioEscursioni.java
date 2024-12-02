package viaggio;

public class viaggioEscursioni extends viaggioPasti{
    private  int escursioni;

    public viaggioEscursioni(String destinazione, int durata, double costo, boolean pensioneComp,int escursioni){
        super(destinazione,  durata, costo, pensioneComp);
        this.escursioni=escursioni;
    }

    public int getEscursioni() {
        return escursioni;
    }

    public void setEscursioni(int escursioni) {
        this.escursioni = escursioni;
    }
}

