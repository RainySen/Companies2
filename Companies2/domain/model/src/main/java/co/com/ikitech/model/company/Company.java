package co.com.ikitech.model.company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    private String id;
    private String name;
    private Long nit;
    private String email;
    private Long cellphone;
    private Boolean admin;
}