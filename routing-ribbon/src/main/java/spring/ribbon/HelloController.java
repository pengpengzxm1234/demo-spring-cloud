package spring.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengpeng
 * @date 2017/11/22 下午2:27
 * @desc
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "hi/{name}")
    public String hi(@PathVariable("name")String name){
        return helloService.hiService(name);
    }

}
