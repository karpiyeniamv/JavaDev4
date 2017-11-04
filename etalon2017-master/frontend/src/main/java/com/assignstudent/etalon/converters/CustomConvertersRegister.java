package com.assignstudent.etalon.converters;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.ConversionServiceFactory;
import org.springframework.core.convert.support.GenericConversionService;

import java.util.Set;

/**
 * @author anpi0316
 *         Date: 24.10.2017
 *         Time: 21:46
 */
public class CustomConvertersRegister implements InitializingBean {

    @Autowired
    private GenericConversionService conversionService;

    private Set<?> converters;

    public CustomConvertersRegister() {
    }

    public void setConverters(Set<?> converters) {
        this.converters = converters;
    }

    public void afterPropertiesSet() throws Exception {
        ConversionServiceFactory.registerConverters(this.converters, this.conversionService);
    }
}