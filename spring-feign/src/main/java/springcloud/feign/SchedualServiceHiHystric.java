package springcloud.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author pengpeng
 * @date 2017/11/22 下午8:37
 * @desc
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(@PathVariable("name") String name) {
        return "sorry " + name;
    }
}
