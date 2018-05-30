package pe.optical.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = { "pe.optical.repository.spring", "pe.optical.repository.spring.impl" })
public class MongoConfig {

	private static final Logger logger = LogManager.getLogger(MongoConfig.class);

	@Value("${mongodb.sne.server.ip}")
	private String serverIP;

	@Value("${mongodb.sne.databasename}")
	private String dataBaseName;

	@Value("${mongodb.sne.port}")
	private int port;

	@Value("${mongodb.sne.username}")
	private String usernameDB;

	@Value("${mongodb.sne.password}")
	private String passwordDB;

	@Value("${mongodb.sne.pool}")
	private int pool;

	@Bean
	public MongoClient mongoClient() {
		try {
			MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
			MongoClientOptions options = builder.connectionsPerHost(pool).build();
			char[] password = passwordDB.toCharArray();
			MongoCredential credential = MongoCredential.createCredential(usernameDB, dataBaseName, password);
			MongoClient mongoClient = new MongoClient(new ServerAddress(serverIP, port), credential, options);
			return mongoClient;
		} catch (Exception ex) {
			logger.error(ex);
			return null;
		}
	}
	
	@Bean
	public MongoDatabase mongoDatabase(MongoClient mongoClient) {
		return mongoClient.getDatabase(dataBaseName);
	}
	

	@Bean
	public MongoTemplate mongoTemplate() {
		return new MongoTemplate(mongoClient(), dataBaseName);
	}

}
