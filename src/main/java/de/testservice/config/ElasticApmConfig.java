package de.testservice.config;

import co.elastic.apm.attach.ElasticApmAttacher;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ElasticApmConfig {

    @PostConstruct
    public void init() {
        if ( System.getenv("ELASTIC_APM_SECRET_TOKEN") != null )
            ElasticApmAttacher.attach();
    }

}
