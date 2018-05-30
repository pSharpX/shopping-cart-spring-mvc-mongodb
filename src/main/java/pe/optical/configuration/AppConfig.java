package pe.optical.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

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
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();

        Resource[] archivosPropiedades = new Resource[]{
                new ClassPathResource("variables.properties")
        };
        pspc.setLocations(archivosPropiedades);
        pspc.setIgnoreUnresolvablePlaceholders(true);
        return pspc;
    }

}
