package ca.gbc.gbccomp3095pet.services;

import ca.gbc.gbccomp3095pet.model.Owner;
import java.util.Set;
public interface OwnerService {

   Owner findByLastname(String lastname);
   Owner findByid(Long id);
   Owner save(Owner owner);
   Set<Owner> findAll();
}
