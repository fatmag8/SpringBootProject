package dao;


import src.main.java.model.Pet;

import java.util.List;

public interface PetRepository {
    Pet findById(Long id);
    List<Pet>findByOwnerId(Long Ownerid);
    void create(Pet pet);
    Pet update(Pet pet);//içeriği güncellenecek pet nesnesi
    void delete(Long id);
    void deleteByOwnerId(Long OwnerId);

}
