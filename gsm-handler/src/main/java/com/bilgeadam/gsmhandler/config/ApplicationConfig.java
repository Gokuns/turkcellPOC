package com.bilgeadam.gsmhandler.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;
import org.springframework.data.repository.init.RepositoryPopulator;

@Configuration
class ApplicationConfig {

    @Bean
    public Jackson2RepositoryPopulatorFactoryBean repositoryPopulator() {
        Resource sourceData = new ClassPathResource("data.json");
        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources(new Resource[] { sourceData });
        return factory;
    }
}