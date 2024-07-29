package humanidad;

public class Humano {
	
	private String piel;
	private String sexo;
	private Integer edad;
	private Boolean humanoCaminando=Boolean.FALSE;
	private Integer distanciaCaminada;
	public String getPiel() {
		return piel;
	}
	
	public void setPiel(String pielDeAfuera) {
		this.piel = pielDeAfuera;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexoDeAfuera) {
		this.sexo = sexoDeAfuera;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public void caminar() {
	humanoCaminando=Boolean.TRUE;	
		
	}
	public void parate () {
		humanoCaminando=Boolean.FALSE;	
			
		}

	public Boolean informacionHumanoCaminando () {
		return humanoCaminando;	
			
		}

	public void caminaEstaDistancia (Integer distancia) {
	
		distanciaCaminada=distancia;
	}
	
	
	public Integer distanciaTotalCaminada () {
		return distanciaCaminada;	
			
		}
	
	
}
