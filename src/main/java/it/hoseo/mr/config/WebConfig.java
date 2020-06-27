package it.hoseo.mr.config;

import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import it.hoseo.mr.converter.ArtistConverter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//	@Override
//	public void addFormatters(FormatterRegistry registry) {
//		registry.addConverter(artistConverter());
//	}
//
//	@Bean
//	public ArtistConverter artistConverter() {
//		return new ArtistConverter();
//	}
}
