package ca.gbc.gbccomp3095pet.services.map;

import ca.gbc.gbccomp3095pet.model.Owner;
import ca.gbc.gbccomp3095pet.services.CRUDservice;

import javax.sql.rowset.CachedRowSet;
import java.util.Set;
import java.util.concurrent.SubmissionPublisher;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CRUDservice<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
