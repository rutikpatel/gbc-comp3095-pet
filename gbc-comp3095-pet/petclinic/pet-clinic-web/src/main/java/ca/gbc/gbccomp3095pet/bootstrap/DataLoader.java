package ca.gbc.gbccomp3095pet.bootstrap;

import ca.gbc.gbccomp3095pet.model.*;
import ca.gbc.gbccomp3095pet.services.OwnerService;
import ca.gbc.gbccomp3095pet.services.PetTypeService;
import ca.gbc.gbccomp3095pet.services.SpecialityService;
import ca.gbc.gbccomp3095pet.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }
    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if(count ==0)
             loadData();


    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType= petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType saveCatPetType= petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDesribution("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDesribution("surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        surgery.setDesribution("dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstname("Rutik");
        owner1.setLastname("Patel");
        owner1.setCity("Anand");
        owner1.setTelephone("51957375033");
        owner1.setAddress("35 Fountaihead");

        Pet brucePet = new Pet();
        brucePet.setName("Fido");
        brucePet.setPetType(saveDogPetType);
        brucePet.setOwner(owner1);
        brucePet.setBirthdate(LocalDate.now());
        owner1.getPets().add(brucePet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstname("Chintan");
        owner2.setLastname("Patel");
        owner2.setCity("Amreli");
        owner2.setTelephone("4376765342");
        owner2.setAddress("1 Fountainhead");

        Pet peterPet = new Pet();
        peterPet.setName("fluffy");
        peterPet.setPetType(saveDogPetType);
        peterPet.setOwner(owner2);
        peterPet.setBirthdate(LocalDate.now());
        owner2.getPets().add(peterPet);

        ownerService.save(owner2);
        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstname("Diana");
        vet1.setLastname("Prince");
        vet1.getSpecilities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstname("Bruce");
        vet2.setLastname("Banner");
        vet2.getSpecilities().add(savedSurgery);
        vetService.save(vet2);
        System.out.println("Loaded Vets ...");
    }
}
