package kardesler;


public class KardeslerKiymaliPide extends Yemek {
	public KardeslerKiymaliPide() {
		isim = "Karde�ler K�ymal� Pide";
		baharatlar.add("Tuz");
		baharatlar.add("So�an");
		baharatlar.add("Karabiber");
		baharatlar.add("Pulbiber");
		baharatlar.add("�sot");
	}
 
	void cut() {
		System.out.println("Pizzan�z dilimlendi");
	}
}