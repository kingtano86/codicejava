package humanidad;

import java.util.ArrayList;
import java.util.List;

public class PuntoDeLanso {

	public static void main(String[] args) {
		
		
		
		System.out.print("hola alex y tano");
		
		Humano tano=new Humano();
		
		tano.setEdad(38);
		tano.setPiel("Blanca");
		tano.setSexo("Masculino");
		System.out.print(tano.getEdad());
		
		
		Humano alex=new Humano();
		
		alex.setEdad(45);
		alex.setPiel("Negra");
		alex.setSexo("Masculino");
		
		Humano luca=new Humano();
		luca.setEdad(13);
		luca.setPiel("Blanca");
		luca.setSexo("Masculino");
		
		System.out.print(alex.getPiel());
		
		tano.caminar();
		tano.informacionHumanoCaminando();
		
		System.out.print(tano.informacionHumanoCaminando());
		
		tano.parate();
		System.out.print(tano.informacionHumanoCaminando());
		
		
		if(alex.informacionHumanoCaminando() || alex.getPiel() == "Negra" ) {
		alex.caminaEstaDistancia(20);	
			
			
			
			
		} else {
		alex.caminar();	
		alex.caminaEstaDistancia(20);	
			
			
			
		}
		
		// &&   y
		// ||   o
		// !    negado 
		// ==  igual 
		// >   mayor
		// <  menor
		// >=  mayor o igual 
		// <= menor o igual 
		// tano es masculino , si alex tiene piel negra si tano su edad es mayor a 20
		// alex ha caminado mas de 10 metros 
		
	
		if (tano.getSexo() == "Masculino"  && alex.getPiel() == "Negra" && tano.getEdad() > 20 && alex.distanciaTotalCaminada()  > 10 ) {
		System.out.print(false);
		}
		
		
		for (int contador = 1; contador <= 10; contador++) {
			
			
			if (contador == 1 || contador == 4 || contador == 8 || contador == 9) {
				System.out.println(contador);
			
			
			}
		
		}
		
		List<String> nombres = new ArrayList<String>();
		nombres.add("Tano");
		nombres.add("Alex");
		nombres.add("Luca");
		nombres.add("Alessia");
		nombres.add("Pepe");
		nombres.add("Juan");

		nombres.remove(2);
		
		System.out.println(nombres.get(0));
		System.out.println(nombres.get(4));
		System.out.println(nombres.size());
		System.out.println(nombres.isEmpty());					
	//	nombres.clear();	
		System.out.println(nombres.isEmpty());		
		String pepe = null; 
		for (String nombre : nombres) {
			if(nombre.equals("Pepe")) {
				pepe = nombre;
			}
			System.out.println(nombre);	
		}
		
		System.out.println(nombres.contains("Tano"));	
		System.out.println(pepe);	
	
		// crear una lista de humanos con 3 humanos tano, luca y alex luego darme la edad de cada uno de esos humanos desde la lista
		// preguntar si la lista esta vacia , ciclar la lista de objetos y imprimir el sexo de cada uno de esos objetos 
		
	
		List<Humano> listaHumanos = new ArrayList<Humano>();
	    listaHumanos.add(alex);
	    listaHumanos.add(tano);
	    listaHumanos.add(luca);
	    
	    System.out.println(listaHumanos.get(0).getEdad());
	    System.out.println(listaHumanos.get(1).getEdad());
	    System.out.println(listaHumanos.get(2).getEdad());
	
	    if(listaHumanos.isEmpty()) {
	    	
	    
	    }
	    
	    System.out.println(listaHumanos.isEmpty());
	    System.out.println("sono qua!! ");
	    for(Humano humano :listaHumanos) {
	    	
	    System.out.println(humano.getSexo());

	    if(humano.getEdad() > 15) {
	    	
	    System.out.println(humano.getPiel());
	    	
	    	
	    }
	    
	   
	    
	}
	    
	}

}
