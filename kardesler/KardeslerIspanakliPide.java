package kardesler;



public class KardeslerIspanakliPide  extends Yemek {
	
	public KardeslerIspanakliPide () {
		isim = "Karde�ler Ispanakl� Pide"; 
		baharatlar.add("Tuz");
		baharatlar.add("Limon");
	
	}
 
	void cut() {
		System.out.println("Pideniz dilimlendi");
	}
}