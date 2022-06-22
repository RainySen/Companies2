package co.com.ikitech.usecase.company;

import co.com.ikitech.model.company.Company;
import co.com.ikitech.model.company.gateways.CompanyRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CompanyUseCase {

    private final CompanyRepository repository;

    public Mono<Company> saveCompany(Company company){

        return repository.save(company);
    }

    public Mono<Void> delete(String id) {

        return repository.deleteById(id);
    }

    public Mono<Company> findById(String id) {
        return repository.findById(id);
    }

    public Flux<Company> getAll() {

        return repository.findAll();
    }
}
