//importação dos pacotes e metodos
package com.hexagon.api.brands.models;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//Localhost "marca" / tipos de veículo
@RequestMapping(value = "/brands")
public class vehicle_type_controller {

    @Autowired
    private vehicle_type_controller vehicle_type_controller;

    @GetMapping // consulta
    public List<vehicle_type> list() {
        return vehicle_type_controller.findAll();
    }

    private List<vehicle_type> findAll() {
        return null;
    }

    @GetMapping("/brands/{id}") // consulta ID
    public Optional<vehicle_type> getvehiclebyId(@PathVariable Long id) {
        return vehicle_type_controller.findbyId(id);
    }

    private Optional<vehicle_type> findbyId(Long id) {
        return null;
    }

    @PostMapping // inserção
    public void save(@RequestBody vehicle_type V) {
        vehicle_type_controller.save(V);
    }

    @PutMapping // alteração
    public void change(@RequestBody vehicle_type V) {
        if (V.getId() > 0)
            vehicle_type_controller.save(V);
    }

    @DeleteMapping // exclusão
    public void delete(@RequestBody vehicle_type V) {
        vehicle_type_controller.delete(V);
    }

    @DeleteMapping("/brands/{id}") // exclusão ID
    public Optional<vehicle_type> deletevehiclebyId(@PathVariable Long id) {
        return vehicle_type_controller.findbyid(id);
    }

    private Optional<vehicle_type> findbyid(Long id) {
        return null;
    }
}