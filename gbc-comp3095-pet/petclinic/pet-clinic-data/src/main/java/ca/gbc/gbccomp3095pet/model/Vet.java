package ca.gbc.gbccomp3095pet.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends  Person{

    private Set<Speciality> specilities = new HashSet<>();

    public Set<Speciality> getSpecilities() {
        return specilities;
    }

    public void setSpecilities(Set<Speciality> specilities) {
        this.specilities = specilities;
    }
}
