package br.rti.tcc.judicbackend.config;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

/*@Configuration
@EnableJpaRepositories(
        basePackages = "br.rti.tcc.judicbackend.repository",
        entityManagerFactoryRef = "judicEntityManager"
)*/
public class JudicDbConfig {
/*    public DataSource judicDataSource(){
        return DataSourceBuilder.create().build();
    }

    public LocalContainerEntityManagerFactoryBean judicEntityManager(
            EntityManagerFactoryBuilder builder,
            @Qualifier("judicDataSource") DataSource dataSource){
        return builder.dataSource(dataSource).packages("br.rti.tcc.judicbackend.model").build();
    }*/
}
