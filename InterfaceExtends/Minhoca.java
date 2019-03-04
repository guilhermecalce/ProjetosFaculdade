
package Etapa1;

public class Minhoca extends Animal
{
	public Minhoca (String especie)
	{
		super(especie);
	}
	public String respirar() //Sobreposição do método abstrato herdado de Animal
	{
		return "A espécie "+ get() + " respira pela pele";
	}
}

