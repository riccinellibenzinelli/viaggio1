package viaggio;

public class viaggioPasti extends Viaggi{
    private  boolean PensioneComp;

    public viaggioPasti(String destinazione, int durata, double costo, boolean PensioneComp){
        super(destinazione,  durata, costo);
        this.PensioneComp=PensioneComp;
    }

    public boolean isPensioneComp() {
        return PensioneComp;
    }

    public void setPensioneComp(boolean pensioneComp) {
        PensioneComp = pensioneComp;
    }
}
