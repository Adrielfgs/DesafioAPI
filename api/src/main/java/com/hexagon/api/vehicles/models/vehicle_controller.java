//importação dos pacotes e metodos
package com.hexagon.api.vehicles.models;

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
import org.springframework.web.bind.annotation.RestController;

//Localhost "veiculos"
@RestController // controlador
@RequestMapping(value = "/vehicles")
public class vehicle_controller {

    @Autowired
    private vehicle_repository vehicle_repository;

    @GetMapping // consulta
    public List<vehicle> list() {
        return vehicle_repository.findAll();
    }

    @GetMapping("/vehicles/{id}") // consulta ID
    public Optional<vehicle> getvehiclebyId(@PathVariable Long id) {
        return vehicle_repository.findById(id);
    }

    @PostMapping // inserção
    public void save(@RequestBody vehicle V) {
        vehicle_repository.save(V);
    }

    @PutMapping // alteração
    public void change(@RequestBody vehicle V) {
        if (V.getId() > 0)
            vehicle_repository.save(V);
    }

    @DeleteMapping // exclusão
    public void delete(@RequestBody vehicle V) {
        vehicle_repository.delete(V);
    }

    @DeleteMapping("/vehicles/{id}") // exclusão ID
    public Optional<vehicle> deletevehiclebyId(@PathVariable Long id) {
        return vehicle_repository.findById(id);
    }
}