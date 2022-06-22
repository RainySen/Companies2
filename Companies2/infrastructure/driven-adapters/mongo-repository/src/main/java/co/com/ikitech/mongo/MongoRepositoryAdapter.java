package co.com.ikitech.mongo;

import co.com.ikitech.model.company.Company;
import co.com.ikitech.model.company.gateways.CompanyRepository;
import co.com.ikitech.mongo.entities.CompanyEntity;
import co.com.ikitech.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class MongoRepositoryAdapter extends AdapterOperations<Company, CompanyEntity, String, MongoDBRepository>
   implements CompanyRepository
{

    public MongoRepositoryAdapter(MongoDBRepository repository, ObjectMapper mapper) {

              super(repository, mapper, d -> mapper.map(d, Company.class));
    }

    @Override
    public Mono<Void> deleteById(String id){
        return repository.deleteById(id);
        
    }

}
