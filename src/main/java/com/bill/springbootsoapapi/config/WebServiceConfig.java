package com.bill.springbootsoapapi.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

/**
 * @author Bill.Lin 2024/9/23
 */
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

//    @Bean(name = "countries")
//    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema) {
//        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
//        wsdl11Definition.setPortTypeName("CountriesPort");
//        wsdl11Definition.setLocationUri("/ws");
//        wsdl11Definition.setTargetNamespace("http://www.baeldung.com/springsoap/gen");
//        wsdl11Definition.setSchema(countriesSchema);
//        return wsdl11Definition;
//    }
//
//    @Bean
//    public XsdSchema countriesSchema() {
//        return new SimpleXsdSchema(new ClassPathResource("countries.xsd"));
//    }
}
