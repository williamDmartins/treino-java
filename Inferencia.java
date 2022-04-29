package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {

		var a = 13;//declaração e inicialização 
		System.out.println(a);
		
		var b = 13.05;
		System.out.println(b);
		
		var c = "texte";
		System.out.println(c);
		
		var d = "aula";
		d = "outra aula";
		System.out.println(d);
		
		double e; // variavel foi declarada
		e = 123.65; // variavel foi inicializada
		System.out.println(e);//usada!
		
		var f = 123.45;
		System.out.println(f);
		
		var g = 12;
		//g = 12.01:(não altera depois que java infere)
		System.out.println(g);
	}

}
