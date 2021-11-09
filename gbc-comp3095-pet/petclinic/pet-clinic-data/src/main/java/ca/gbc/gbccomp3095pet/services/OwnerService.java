package ca.gbc.gbccomp3095pet.services;

import ca.gbc.gbccomp3095pet.model.Owner;

public interface OwnerService extends CRUDservice<Owner, Long>{

   Owner findByLastname(String lastname);

}
