package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.util.Set;

/**
 * Created by Xinjie on 2018/11/19 8:46 PM.
 */
@Data
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;

}
