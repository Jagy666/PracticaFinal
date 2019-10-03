/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JAGY6
 */
@Entity
@Table(name = "CLIENTESBANCO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientesbanco.findAll", query = "SELECT c FROM Clientesbanco c")
    , @NamedQuery(name = "Clientesbanco.findByNombre", query = "SELECT c FROM Clientesbanco c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Clientesbanco.findByApellido", query = "SELECT c FROM Clientesbanco c WHERE c.apellido = :apellido")
    , @NamedQuery(name = "Clientesbanco.findByCedula", query = "SELECT c FROM Clientesbanco c WHERE c.cedula = :cedula")
    , @NamedQuery(name = "Clientesbanco.findByTelefono", query = "SELECT c FROM Clientesbanco c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "Clientesbanco.findByEdad", query = "SELECT c FROM Clientesbanco c WHERE c.edad = :edad")
    , @NamedQuery(name = "Clientesbanco.findByEstadocivil", query = "SELECT c FROM Clientesbanco c WHERE c.estadocivil = :estadocivil")
    , @NamedQuery(name = "Clientesbanco.findBySituacionlaboral", query = "SELECT c FROM Clientesbanco c WHERE c.situacionlaboral = :situacionlaboral")
    , @NamedQuery(name = "Clientesbanco.findByCuentabancaria", query = "SELECT c FROM Clientesbanco c WHERE c.cuentabancaria = :cuentabancaria")})
public class Clientesbanco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "APELLIDO")
    private String apellido;
    @Size(max = 15)
    @Column(name = "CEDULA")
    private String cedula;
    @Size(max = 15)
    @Column(name = "TELEFONO")
    private String telefono;
    @Size(max = 3)
    @Column(name = "EDAD")
    private String edad;
    @Size(max = 15)
    @Column(name = "ESTADOCIVIL")
    private String estadocivil;
    @Size(max = 15)
    @Column(name = "SITUACIONLABORAL")
    private String situacionlaboral;
    @Size(max = 15)
    @Column(name = "CUENTABANCARIA")
    private String cuentabancaria;

    public Clientesbanco() {
    }

    public Clientesbanco(String nombre) {
        this.nombre = nombre;
    }

    public Clientesbanco(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getSituacionlaboral() {
        return situacionlaboral;
    }

    public void setSituacionlaboral(String situacionlaboral) {
        this.situacionlaboral = situacionlaboral;
    }

    public String getCuentabancaria() {
        return cuentabancaria;
    }

    public void setCuentabancaria(String cuentabancaria) {
        this.cuentabancaria = cuentabancaria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientesbanco)) {
            return false;
        }
        Clientesbanco other = (Clientesbanco) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Clientesbanco[ nombre=" + nombre + " ]";
    }
    
}
