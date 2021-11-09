package ca.gbc.gbccomp3095pet.services.map;

import ca.gbc.gbccomp3095pet.model.Vet;
import ca.gbc.gbccomp3095pet.services.CRUDservice;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CRUDservice<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
