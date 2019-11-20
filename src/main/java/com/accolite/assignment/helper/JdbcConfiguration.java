/*
package com.accolite.assignment.helper;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


public class JdbcConfiguration
{
   @Bean
   public DataSource dataSource()
   {
      DriverManagerDataSource dataSource = new DriverManagerDataSource();

      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
      dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/NEWAQUA");
      dataSource.setUsername("root");
      dataSource.setPassword("root");

      return dataSource;
   }

   @Bean
   public NamedParameterJdbcTemplate namedParameterJdbcTemplate()
   {
      NamedParameterJdbcTemplate retBean
          = new NamedParameterJdbcTemplate(dataSource());
       return retBean;
   }


}*/
