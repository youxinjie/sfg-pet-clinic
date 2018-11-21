package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Xinjie on 2018/11/20 8:13 PM.
 */
@Data
public class BaseEntity implements Serializable {

    private Long id;
}
