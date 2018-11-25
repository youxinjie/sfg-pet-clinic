package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Xinjie on 2018/11/25 5:14 PM.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
