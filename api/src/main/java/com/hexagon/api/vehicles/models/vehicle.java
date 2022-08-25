//importação dos pacotes e metodos
package com.hexagon.api.vehicles.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // classe responsavel por mapeamento da entidade
class vehicle {

    @Id // atribuitos da classe / tabela BD
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gerador de haves
    private Long id;
    @Column(nullable = false) //coluna nao pode estar vazia
    private String name;
    @Column(nullable = false)
    private String desc;
    @Column(nullable = false)
    private int vehycle_type;
    @Column(nullable = false)
    private String plate;

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

    public int getVehycle_type() {
        return vehycle_type;
    }

    public void setVehycle_type(int vehycle_type) {
        this.vehycle_type = vehycle_type;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;

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
        vehicle other = (vehicle) obj;
        if (id != other.id)
            return false;
        return true;
    }

    // representação dos objetos
    @Override
    public String toString() {
        return "vehicle [desc=" + desc + ", id=" + id + ", name=" + name + ", plate=" + plate + ", vehycle_type="
                + vehycle_type + "]";
    }
}
