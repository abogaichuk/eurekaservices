package volotsyuga.apps.eurekaservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HitsController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${hits.message}")
    private String message;

//    @RequestMapping("/service-instances/{applicationName}")
//    public List<ServiceInstance> serviceInstancesByApplicationName(
//            @PathVariable String applicationName) {
//        return this.discoveryClient.getInstances(applicationName);
//    }

//    @RequestMapping("/")
//    public String home() {
//        return "Hello world";
//    }

    @RequestMapping("/message")
    public String getMessageFromConfigServer() {
        return message;
    }
}
