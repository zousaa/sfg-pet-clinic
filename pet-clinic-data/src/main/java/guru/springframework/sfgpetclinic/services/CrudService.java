package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface CrudService<T , ID> {

    Set<T> findAll();

    T save(T object);

    T findById(ID id);

    void delete(T object);

    void deleteById(ID id);



}
