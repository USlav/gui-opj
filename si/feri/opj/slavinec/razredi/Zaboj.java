package si.feri.opj.slavinec.razredi;

import java.time.LocalDate;
import java.util.Arrays;

public class Zaboj extends Posiljka {
    private OznakaZaboja oznaka;

    public Zaboj(OznakaZaboja oznaka) {
        super();
        this.oznaka = oznaka;
    }

    public void setOznaka(OznakaZaboja oznaka) {
        this.oznaka = oznaka;
    }
    public OznakaZaboja getOznaka() {
		return oznaka;
	}

    public Zaboj(String naziv, Dimenzije dimenzije, LocalDate datumOdposlanja) {
        super(naziv, dimenzije, datumOdposlanja);

    }

    @Override
    public String toString() {
        return "Zaboj{" + "naziv='" + getNaziv() + '\'' + ", dimenzije=" + getDimenzije() + ", datumOdposlanja="
                + getDatumOdposlanja() + ", seznamArtiklov=" + Arrays.toString(getSeznamArtiklov()) + '}';

    }
}
