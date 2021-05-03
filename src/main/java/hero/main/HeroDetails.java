package hero.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HeroDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long peso;
	private Long altura;
	private String descripcion;
	
	public Long getPeso() {
		return peso;
	}
	public void setPeso(Long peso) {
		this.peso = peso;
	}
	public Long getAltura() {
		return altura;
	}
	public void setAltura(Long altura) {
		this.altura = altura;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
