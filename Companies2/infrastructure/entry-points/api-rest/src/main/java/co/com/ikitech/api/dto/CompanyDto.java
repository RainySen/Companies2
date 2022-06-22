package co.com.ikitech.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {

    private String id;
    private String name;
    private Long nit;
    private String email;
    private Long cellphone;
    private Boolean admin;
}
