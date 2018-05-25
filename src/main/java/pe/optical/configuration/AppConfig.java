package pe.optical.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:variables.properties")
@ComponentScans(value = {
	@ComponentScan("pe.optical.configuration"),
	@ComponentScan("pe.optical.converter.impl"),
	@ComponentScan("pe.optical.repository.impl"),
	@ComponentScan("pe.optical.service.impl")
})
public class AppConfig {
	
	@Autowired
	private Environment env;

}
