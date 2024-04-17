package si.feri.opj.slavinec.razredi;

import java.time.LocalDate;

public class Paket extends Posiljka {
    private boolean dragocenost;

    public Paket() {
        super();
    }

    public Paket(String naziv, LocalDate datumOdposlanja) {
        super(naziv, datumOdposlanja);

    }

    public void setDragocenost(boolean dragocenost) {
        this.dragocenost = dragocenost;
    }

    public boolean getDragocenost() {
        return dragocenost;
    }

    @Override
    public String toString() {
        return "Paket{" + "naziv='" + getNaziv() + '\'' + ", dimenzije=" + getDimenzije() + ", dragocenost="
                + dragocenost
                + ", datumOdposlanja="
                + getDatumOdposlanja() + '}';

    }
}
