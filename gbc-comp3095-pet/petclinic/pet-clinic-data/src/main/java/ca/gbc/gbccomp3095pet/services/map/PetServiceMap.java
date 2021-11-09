package ca.gbc.gbccomp3095pet.services.map;

import ca.gbc.gbccomp3095pet.model.Pet;
import ca.gbc.gbccomp3095pet.services.CRUDservice;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CRUDservice<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
