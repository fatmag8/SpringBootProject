package service;

import src.main.java.model.Owner;

import java.util.List;

public interface PetClinicService {
    List<Owner> findOwners();
    List<Owner> findOwners(String LastName);
}
