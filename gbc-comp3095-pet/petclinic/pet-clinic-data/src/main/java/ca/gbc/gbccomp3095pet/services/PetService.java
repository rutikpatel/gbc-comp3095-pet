package ca.gbc.gbccomp3095pet.services;

import ca.gbc.gbccomp3095pet.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByid(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
