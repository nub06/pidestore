package kardesler;


public abstract class Ocakba�� {
	 
	abstract Yemek yapYemek(String item);
 
	public Yemek siparisYemek(String type) {
		Yemek yemek = yapYemek(type);
		yemek.hazirla();
		yemek.pisir();	
		return yemek;
	}
}