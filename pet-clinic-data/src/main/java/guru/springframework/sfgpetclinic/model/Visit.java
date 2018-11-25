package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * Created by Xinjie on 2018/11/25 3:05 PM.
 */
@Data
public class Visit extends BaseEntity {

    private LocalDate date;
    private String description;
    private Pet pet;
}
