package ca.gbc.gbccomp3095pet.bootstrap;

import ca.gbc.gbccomp3095pet.model.Owner;
import ca.gbc.gbccomp3095pet.model.Vet;
import ca.gbc.gbccomp3095pet.services.OwnerService;
import ca.gbc.gbccomp3095pet.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }
    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstname("Rutik");
        owner1.setLastname("Patel");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstname("Chintan");
        owner2.setLastname("Patel");
        ownerService.save(owner2);
        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstname("Diana");
        vet1.setLastname("Prince");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstname("Bruce");
        vet2.setLastname("Banner");
        vetService.save(vet2);
        System.out.println("Loaded Vets ...");
    }
}
