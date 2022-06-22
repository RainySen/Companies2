package co.com.ikitech.mongo;

import co.com.ikitech.model.company.Company;
import co.com.ikitech.mongo.entities.CompanyEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MongoDBRepository extends ReactiveMongoRepository<CompanyEntity, String>, ReactiveQueryByExampleExecutor<CompanyEntity> {

    Mono<Void> deleteById(String id);

}
