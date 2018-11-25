package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Xinjie on 2018/11/19 8:44 PM.
 */
@Data
public class Vet extends Person{

    private Set<Speciality> specialities = new HashSet<>();
}
