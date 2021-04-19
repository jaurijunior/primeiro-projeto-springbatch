package jauri.junior.primeiroprojetospringbatch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile(value = { "qa", "prod" })
@PropertySource(value = "file:./config/application-${spring.profiles.active}.yml", ignoreResourceNotFound = true)
public class PropsConfig {

	/*
	 * OPCAO PARA INFORMAR O APPLICATION
	 * EM UM LOCAL DIFERENTE DO PADRAO DO SPRING BOOT
	 */
	/* @Bean
	public PropertySourcesPlaceholderConfigurer config() {
		PropertySourcesPlaceholderConfigurer placeholderConfig = new PropertySourcesPlaceholderConfigurer();
		placeholderConfig.setLocation(new FileSystemResource("./job/config/applictaion.yml"));
		return placeholderConfig;
	}*/

}
