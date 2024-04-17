package si.feri.opj.slavinec.razredi;

public class PremiumSkladisce extends Depo {
    private boolean kamera;

    public boolean getKamera() {
        return kamera;
    }

    public PremiumSkladisce() {

    }

    public PremiumSkladisce(String naziv, String lokacija, int stPosiljk, boolean kamera) {
        super(naziv, lokacija, stPosiljk);
        this.kamera = kamera;
    }

    @Override
    public double vrniCenoSkladiscenja() {
        double osnovnaCena = 0;
        for (int index = 0; index < super.getSeznamPosiljk().length; index++) {
            if (super.getSeznamPosiljk()[index] != null) {
                for (int j = 0; j < super.getSeznamPosiljk()[index].getSeznamArtiklov().length; j++) {
                    if (super.getSeznamPosiljk()[index].getSeznamArtiklov()[j] != null) {
                        osnovnaCena += super.getSeznamPosiljk()[index].getSeznamArtiklov()[j].getCena();
                    }
                }
            }
        }
        if (kamera) {
            osnovnaCena = osnovnaCena * 2;
        }
        return osnovnaCena;
    }

    @Override
    public String toString() {
        return "PremiumSkladisce{" + super.toString() + ", Kamera: " + kamera + "}";
    }

}
