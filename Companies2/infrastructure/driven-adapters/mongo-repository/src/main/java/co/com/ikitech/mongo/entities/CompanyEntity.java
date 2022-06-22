package co.com.ikitech.mongo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "companies")
public class CompanyEntity {

    @Id
    private String id;
    private String name;
    private Long nit;
    private String email;
    private Long cellphone;
    private Boolean admin;
}
