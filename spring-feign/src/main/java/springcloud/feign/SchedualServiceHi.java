package springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author pengpeng
 * @date 2017/11/22 下午4:41
 * @desc
 */
@FeignClient(value = "eureka-client-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    String sayHiFromClientOne(@PathVariable("name")String name);
}
