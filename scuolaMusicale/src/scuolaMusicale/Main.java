package scuolaMusicale;

public class Main {

	public static void main(String[] args) {
		
//		2. Supponiamo di dover modellare un'applicazione per una scuola di musica. 
//		Ogni strumento musicale può essere suonato, ma gli strumenti possono avere anche comportamenti specifici. 
//		Utilizziamo una classe astratta StrumentoMusicale che definisce un metodo suona() comune a tutti gli strumenti. 
//		Definiamo tre interfacce: StrumentoAFiato, StrumentoAPercussione, StrumentoACorda, 
//		che rappresentano categorie di strumenti musicali specifiche. 
//		Implementiamo due classi concrete: Chitarra che estende StrumentoMusicale e implementa StrumentoACorda, 
//		e Flauto che estende StrumentoMusicale e implementa StrumentoAFiato.
//		Realizza l'esercizio in Java creando anche un main che istanzi una chitarra e un flato e li utilizzi.
		
		
		Chitarra chitarra1 = new Chitarra("Fender", "elettrica");
		Flauto flauto1 = new Flauto("Armstrong", "traverso");
		
		System.out.println(chitarra1.suona());
		System.out.println(chitarra1.pizzica());

		System.out.println(flauto1.suona());
		System.out.println(flauto1.soffia());

		
	}

}
