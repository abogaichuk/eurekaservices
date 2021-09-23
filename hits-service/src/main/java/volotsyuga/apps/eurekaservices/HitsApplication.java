package volotsyuga.apps.eurekaservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//to dynamically update property call: curl localhost:8080/actuator/refresh -d {} -H "Content-Type: application/json"
@SpringBootApplication
@EnableDiscoveryClient
public class HitsApplication {
    public static void main(String[] args) {
        SpringApplication.run(HitsApplication.class, args);
    }
}
