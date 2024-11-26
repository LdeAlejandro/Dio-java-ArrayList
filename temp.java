/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		List<Carro> listCarros = new ArrayList <>();
		
		listCarros.add(new Carro("Ford"));
		listCarros.add(new Carro("Chevrolet"));
		listCarros.add(new Carro("Fiat"));
		listCarros.add(new Carro("Peugeot"));
		
		//contains validar se a lista contem um elemento
		System.out.println(listCarros.contains(("Peugeot"));
		
		//get para pegar um elemento pelo index
		System.out.println(listCarros.get(2));
		
		//Verificar o indice do elemento
		System.out.println(listCarros.indexOf(new Carro ("Fiat")));
		
		//Elimina um elemeto da lista pelo indice
        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);

	}
}

// package dio;

import java.util.Objects;

public class Carro{

    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o){
        // Se o objeto comparado for o mesmo objeto (mesma referência na memória), retorna verdadeiro

        if (this == o) return true;

        // Verifica se o objeto atual é nulo ou se o objeto recebido não é da mesma classe
        if(this == null || getClass() != o.getClass()) return false;

        // Converte o objeto para o tipo Carro
        Carro carro = (Carro) o;

        // Compara a marca dos carros, usando Objects.equals para tratar casos de nulo
        return Objects.equals(marca, carro.marca);

    }

    @Override
    public int hashCode(){
        return Objects.hash(marca);
    }
    
    @Override
    public String toString() {
        return  "Carro{" +
                "marca=" + marca + "\'" +
                '"}";
    }


}

