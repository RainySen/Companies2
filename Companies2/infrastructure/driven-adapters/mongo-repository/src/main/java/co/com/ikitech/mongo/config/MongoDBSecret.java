package co.com.ikitech.mongo.config;

import lombok.Builder;
import lombok.Getter;
@Builder
@Getter
public class MongoDBSecret {
private final String uri;


}