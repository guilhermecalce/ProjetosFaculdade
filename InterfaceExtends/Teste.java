
package Etapa1;


public class Teste {
    
    public static void main (String[] args) throws java.lang.Exception
	{
		Animal a = new Minhoca ("Pontoscolex corethrurus");
		Comparavel c1 = new Elefante ("Loxodonta sp",1000);
		Comparavel c2 = new Elefante ("Elephas sp",1500);
		System.out.println(a.respirar());
		System.out.println(((Elefante)c1).respirar()); //Note que aqui foi necessário casting
		System.out.println(((Elefante)c2).respirar()); //Aqui também
		System.out.println(c1.compara(c2));
	}
    
}


