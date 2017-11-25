package springcloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengpeng
 * @date 2017/11/22 下午4:43
 * @desc
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "hi/{name}", method = RequestMethod.GET)
    public String sayHi(@PathVariable("name")String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
