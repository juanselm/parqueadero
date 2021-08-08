package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Vehiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false)
    private String placa;
    private Date fecha_ingreso;
    private Date fecha_salida;

    public Vehiculo() {
    }

    public Vehiculo(Long id, String placa, Date fecha_ingreso, Date fecha_salida) {
        this.id = id;
        this.placa = placa;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Id=" + id +
                ", placa='" + placa + '\'' +
                ", fecha_ingreso=" + fecha_ingreso +
                ", fecha_salida=" + fecha_salida +
                '}';
    }
}