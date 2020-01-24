package kardesler;

public class KebapOcakbaþý extends Ocakbaþý {

	Yemek yapYemek(String item) {
		if (item.equals("beyti")) {
			return new KardeslerBeytiKebap();
		} else if (item.equals("adana")) {
			return new KardeslerAdanaKebap();
		} else if (item.equals("urfa")) {
			return new KardeslerUrfaKebap();
		} 
		else return null;
	}
}