package uz.pdp.appjparelationships.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {
    private String firstname;
    private String lastname;
    private String city;
    private String district;
    private String street;
    private Integer groupId;
}
