package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Xinjie on 2018/11/25 5:12 PM.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
