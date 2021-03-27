package com.hxb.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * The type Jdbc config.
 *
 * @author 和学博
 */
@Configuration
public class JdbcConfig {

    private final DataSource dataSource;

    /**
     * Instantiates a new Jdbc config.
     *
     * @param dataSource the data source
     */
    public JdbcConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Get template jdbc template.
     *
     * @return the jdbc template
     */
    @Bean
    public JdbcTemplate getTemplate(){
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);
        return template;
    }

}
