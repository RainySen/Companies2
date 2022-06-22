package co.com.ikitech.model.company.gateways;

import co.com.ikitech.model.company.Company;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CompanyRepository {

    Mono<Company> save(Company company);


    Mono<Company> findById(String id);


    Mono<Void> deleteById(String id);

    Flux<Company> findAll();

}

















 /*  List<Company> getAll();

    Mono<Company> getCompany(String id);*/