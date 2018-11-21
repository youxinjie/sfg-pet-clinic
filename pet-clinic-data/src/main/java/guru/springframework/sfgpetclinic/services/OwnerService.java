package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Xinjie on 2018/11/20 8:03 PM.
 */
public interface OwnerService {

    Owner findById(Long id);

    Owner findByLsatName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
