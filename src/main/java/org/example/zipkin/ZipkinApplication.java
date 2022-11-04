package org.example.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(ZipkinApplication.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
