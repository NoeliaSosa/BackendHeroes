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
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String name;

    private Long detalle;

    private Long direccion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDetalle() {
        return detalle;
    }

    public void setDetalle(Long detalle) {
        this.detalle = detalle;
    }

    public Long getDireccion() {
        return direccion;
    }

    public void setDireccion(Long direccion) {
        this.direccion = direccion;
    }
}