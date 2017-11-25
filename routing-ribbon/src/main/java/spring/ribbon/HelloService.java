package spring.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author pengpeng
 * @date 2017/11/22 下午2:25
 * @desc
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT-HI/hi/" + name, String.class);
    }

    public String hiError(String name){
        return "hi, " + name + "，sorry，error！";
    }
}
