package si.feri.opj.slavinec.razredi;

public class Skladisce extends Depo {

    public Skladisce(String naziv, String lokacija, int stPosiljk) {
        super(naziv, lokacija, stPosiljk);
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
        return osnovnaCena;
    }

    @Override
    public String toString() {
        return "Skladisce{" + super.toString() + "}";
    }

}
