
package Etapa1;

public class Elefante extends Animal implements Comparavel
{
	private double peso;
	
	public Elefante (String especie, double peso)
	{
		super(especie);
		this.peso = peso;
	}
	public String respirar() //Sobreposição do método abstrato herdado de Animal
	{
		return "A espécie "+ get() + " respira pela tromba";
	}
	public String compara(Comparavel e)
	{
		return ((this.peso > ((Elefante)e).peso)? this.get(): ((Elefante)e).get()) +" é mais gordo";
	}
}

