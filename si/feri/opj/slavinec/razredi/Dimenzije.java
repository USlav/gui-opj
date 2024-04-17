package si.feri.opj.slavinec.razredi;

/**
 * 
 * Razred Dimenzije
 *
 * @author Urh Slavinec
 * @version 1.0
 */
public class Dimenzije {
    private double visina;
    private double sirina;
    private double dolzina;

    /**
     * Konstruktor razreda dimenzije
     * 
     * @param visina  visina artikla oz. zaboja
     * @param sirina  sirina artikla oz.zaboja
     * @param dolzina dolzinia artikla oz.zaboja
     */
    public Dimenzije(double visina, double sirina, double dolzina) throws IllegalArgumentException{
    	if (visina < 0 || dolzina < 0 || sirina < 0) {
			throw new IllegalArgumentException();
		}
        this.visina = visina;
        this.sirina = sirina;
        this.dolzina = dolzina;
    	
    }

    /**
     * metoda ki vrne volumen
     * 
     * @return vrne rezultat tipa double
     */
    public double izracunajVolumen() {
        return visina * sirina * dolzina;
    }

    @Override
    public String toString() {
        return "Dimenzije{" + "visina=" + visina + ", sirina=" + sirina + ", dolzina=" + dolzina + '}';
    }

    public double getVisina() {
        return visina;
    }

    public double getSirina() {
        return sirina;
    }

    public double getDolzina() {
        return dolzina;
    }
}