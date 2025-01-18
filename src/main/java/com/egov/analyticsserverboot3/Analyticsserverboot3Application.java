package com.egov.analyticsserverboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Analyticsserverboot3Application
{

    public static void main(String[] args)
    {
        SpringApplication.run(Analyticsserverboot3Application.class, args);
    }

}
