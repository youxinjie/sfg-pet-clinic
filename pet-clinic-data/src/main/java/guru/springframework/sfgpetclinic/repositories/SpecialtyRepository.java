package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Xinjie on 2018/11/25 5:13 PM.
 */
public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
