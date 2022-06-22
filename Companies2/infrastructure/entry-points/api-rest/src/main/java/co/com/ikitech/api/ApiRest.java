package co.com.ikitech.api;
import co.com.ikitech.api.dto.CompanyDto;
import co.com.ikitech.model.company.Company;
import co.com.ikitech.usecase.company.CompanyUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.swing.*;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final CompanyUseCase useCase;


    @PostMapping(path = "/company")
    public Mono<Company> saveCompany(@RequestBody CompanyDto companyDto) {

        Company company = new Company();

        company.setId(String.valueOf(companyDto.getNit()));
        company.setName(companyDto.getName());
        company.setNit(companyDto.getNit());
        company.setEmail(companyDto.getEmail());
        company.setCellphone(companyDto.getCellphone());
        company.setAdmin(companyDto.getAdmin());

        return useCase.saveCompany(company);
    }

    @PutMapping(path = "/company/{id}")
    public Mono<Company> updateCompany(@RequestBody CompanyDto companyDto) {
        Company company = new Company();
        company.setName(companyDto.getName());
        company.setNit(companyDto.getNit());
        company.setEmail(companyDto.getEmail());
        company.setCellphone(companyDto.getCellphone());
        company.setAdmin(companyDto.getAdmin());

        return useCase.saveCompany(company);
    }

    @GetMapping(path = "/company/{id}")
    public Mono<Company> getCompany(@PathVariable String id) {
        return useCase.findById(id);

    }

    @DeleteMapping(path = "/company/{id}")
    public Mono<Void> delete (@PathVariable String id){
        return useCase.delete(id);

    }

    @GetMapping(path = "/company/list")
    public Flux<Company> getAll() {
        return useCase.getAll();
    }
}