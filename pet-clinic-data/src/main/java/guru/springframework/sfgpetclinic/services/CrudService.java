package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Xinjie on 2018/11/20 8:25 PM.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
