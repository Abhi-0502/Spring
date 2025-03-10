package com.xworkz.registration.configuration;

import com.xworkz.registration.constant.ServiceConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.util.Properties;


@Configuration
@ComponentScan(basePackages = "com.xworkz.registration")
@EnableWebMvc //used to validate;
@Slf4j

public class SpringConfiguration {
    public SpringConfiguration(){
        System.out.println("Spring configuration constructor invoked");
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean getbean() {
            LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
            bean.setPackagesToScan("com.xworkz.registration.entity");
            bean.setDataSource(dataSource());
            bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
            bean.setJpaProperties(getProperties());
            return bean;
        }
        @Bean
        public Properties getProperties(){
            Properties properties = new Properties();
            properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
            return properties;
        }

        @Bean
        public DataSource dataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/newyear");
            dataSource.setUsername("root");
            dataSource.setPassword("root@0502");
            return dataSource;
        }
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    @Bean
    public MultipartResolver multipartResolver(){
        return new StandardServletMultipartResolver();
    }
    @Bean
    public JavaMailSender getmail(){
        log.info("Mail method invoked");
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setUsername(ServiceConstant.FROM_EMAIL.getPath());
        javaMailSender.setPassword(ServiceConstant.password.getPath());
        javaMailSender.setPort(587);
        javaMailSender.setHost("smtp.gmail.com");
        Properties javaMailProperties = javaMailSender.getJavaMailProperties();
        javaMailProperties.put("mail.transport.protocol", "smtp");
        javaMailProperties.put("mail.smtp.auth", "true");
        javaMailProperties.put("mail.smtp.starttls.enable", "true");
        javaMailProperties.put("mail.debug", "true");
        javaMailProperties.put("mail.smtp.ssl.trust","smtp.gmail.com");

        return javaMailSender;
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
