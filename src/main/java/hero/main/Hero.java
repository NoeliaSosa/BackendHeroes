package hero.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Hero {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    private String name;
    
    @OneToOne
    @JoinColumn(name = "detalleId")
    private HeroDetails detalles;
    
    @OneToOne
    @JoinColumn(name = "direccionId")
    private HeroDireccion direccion;
 
    public HeroDetails getDetalles() {
		return detalles;
	}

	public void setDetalles(HeroDetails detalles) {
		this.detalles = detalles;
	}

	public HeroDireccion getDireccion() {
		return direccion;
	}

	public void setDireccion(HeroDireccion direccion) {
		this.direccion = direccion;
	}

	public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public void setName(String name) {
        this.name = name;
    }
     
    public String getName() {
        return name;
    }
}