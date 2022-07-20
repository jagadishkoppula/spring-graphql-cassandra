package com.springgraphql.sample.bookdetails.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;


@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration{

    @Override
    protected String getKeyspaceName() {
        return "bookdetails";
    }

    @Override
    public String[] getEntityBasePackages(){
        return new String[]{"com.springgraphql.sample.bookdetails.data"};
    }
}
