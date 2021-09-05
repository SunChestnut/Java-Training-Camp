package syl.camp.springdemo.homework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunyl
 * @date 2021/9/5 3:18 下午
 * @see syl.camp.springdemo.homework.controller
 */
@RestController
public class HealthCheckController {

    @RequestMapping("/test")
    public String healthCheck(String param) {
        return "Health Check - " + param;
    }

}
