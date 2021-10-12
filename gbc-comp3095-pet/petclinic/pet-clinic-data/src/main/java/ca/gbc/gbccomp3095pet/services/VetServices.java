package ca.gbc.gbccomp3095pet.services;

import ca.gbc.gbccomp3095pet.model.Pet;
import ca.gbc.gbccomp3095pet.model.Vet;

import java.util.Set;

public interface VetServices {
    Vet findByid(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
