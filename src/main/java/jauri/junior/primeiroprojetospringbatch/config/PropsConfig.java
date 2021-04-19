package jauri.junior.primeiroprojetospringbatch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class PropsConfig {
	
	/*
	 * O Spring Boot por padrão procura as configurações em FileSystemResource informado
	 */
	/*
	 * @Bean public PropertySourcesPlaceholderConfigurer config() {
	 * PropertySourcesPlaceholderConfigurer placeholderConfig = new
	 * PropertySourcesPlaceholderConfigurer(); placeholderConfig.setLocation(new
	 * FileSystemResource("./job/config/applictaion.yml")); return
	 * placeholderConfig; }
	 */
	

}
