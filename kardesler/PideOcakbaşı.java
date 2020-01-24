package kardesler;

public class PideOcakbaþý extends Ocakbaþý{

	Yemek yapYemek(String item) {
        	if (item.equals("kasarli")) {
            		return new KardeslerKasarliPide();
        	} else if (item.equals("dortmevsim")) {
        	    	return new KardeslerDortMevsimPide();
        	} else if (item.equals("kiymali")) {
        	    	return new KardeslerKiymaliPide();
        	} else if (item.equals("ispanakli")) {
            		return new KardeslerIspanakliPide();
        	} else return null;
	}
}

