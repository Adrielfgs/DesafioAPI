//importação dos pacotes e metodos
package com.hexagon.api.brands.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // classe responsavel por mapeamento da entidade
public class vehicle_type {

    @Id // atribuitos da classe / tabela BD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String desc;

    // Metodos getters e setters
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;

    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    // encontrando objetos dentro da coleção
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        vehicle_type other = (vehicle_type) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    // representação dos objetos
    @Override
    public String toString() {
        return "vehicle_type [desc=" + desc + ", id=" + id + ", name=" + name + "]";
    }

}
