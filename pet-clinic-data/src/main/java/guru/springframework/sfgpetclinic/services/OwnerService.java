package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by Xinjie on 2018/11/20 8:03 PM.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLsatName(String lastName);
}
