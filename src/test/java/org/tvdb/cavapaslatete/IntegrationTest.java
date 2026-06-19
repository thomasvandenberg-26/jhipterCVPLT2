package org.tvdb.cavapaslatete;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.context.ImportTestcontainers;
import org.tvdb.cavapaslatete.config.AsyncSyncConfiguration;
import org.tvdb.cavapaslatete.config.DatabaseTestcontainer;
import org.tvdb.cavapaslatete.config.ElasticsearchTestConfiguration;
import org.tvdb.cavapaslatete.config.ElasticsearchTestContainer;
import org.tvdb.cavapaslatete.config.JacksonConfiguration;
import org.tvdb.cavapaslatete.config.RedisTestContainer;
import org.tvdb.cavapaslatete.config.TestSecurityConfiguration;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        CvpltApp.class,
        JacksonConfiguration.class,
        AsyncSyncConfiguration.class,
        TestSecurityConfiguration.class,
        org.tvdb.cavapaslatete.config.JacksonHibernateConfiguration.class,
        ElasticsearchTestConfiguration.class,
    }
)
@ImportTestcontainers({ DatabaseTestcontainer.class, ElasticsearchTestContainer.class, RedisTestContainer.class })
public @interface IntegrationTest {}
