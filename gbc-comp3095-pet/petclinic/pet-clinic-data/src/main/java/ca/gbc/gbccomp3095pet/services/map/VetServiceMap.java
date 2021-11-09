package ca.gbc.gbccomp3095pet.services.map;

import ca.gbc.gbccomp3095pet.model.Speciality;
import ca.gbc.gbccomp3095pet.model.Vet;
import ca.gbc.gbccomp3095pet.services.SpecialityService;
import ca.gbc.gbccomp3095pet.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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
        if(object.getSpecilities().size()>0){
            object.getSpecilities().forEach( speciality -> {
                if (speciality.getId() == null){
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }

            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
    

    
}
