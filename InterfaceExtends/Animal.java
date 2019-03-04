
package Etapa1;


public abstract class Animal {
    private String especie;
	public Animal (String especie) //Construtor
	{
		this.especie = especie;
	}
	public String get ()
	{
		return especie;
	}
	public abstract String respirar();

}
