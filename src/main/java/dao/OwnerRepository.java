package dao;

import src.main.java.model.Owner;

import java.util.List;

public interface OwnerRepository {
    List<Owner> findAll();
    Owner findById(Long id);
    List<Owner>findByLastName(String lastName);
    void create(Owner owner);
    Owner update(Owner owner);//içeriği güncellenecek owner nesnesi
    void delete(Long id);

}
