package kardesler;


public class FactoryYemek  {
	 
		public Yemek yapYemek(String style, String type) {
			Yemek yemek = null;
			if (style.equals("kebap")) {
				if (type.equals("beyti")) {
					yemek = new KardeslerBeytiKebap();
				} else if (type.equals("adana")) {
					yemek = new KardeslerAdanaKebap();
				} else if (type.equals("urfa")) {
					yemek = new KardeslerUrfaKebap();
				} 					
			} else if (style.equals("pide")) {
				if (type.equals("kasarli")) {
					yemek = new KardeslerKasarliPide();
				} else if (type.equals("dortmevsim")) {
					yemek = new KardeslerDortMevsimPide();
				} else if (type.equals("kiymali")) {
					yemek = new KardeslerKiymaliPide();
				} else if (type.equals("ispanakli")) {
					yemek = new KardeslerIspanakliPide();
				}
			} else {
				System.out.println("Hatali Secim");
				return null;
			}
			yemek.hazirla();
			yemek.pisir();

			return yemek;
		}
		}


