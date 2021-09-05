package syl.camp.springdemo.trash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunyl
 * @date 2021/9/1 4:07 下午
 * @see syl.camp.springdemo.trash
 */
@RestController
public class HaHaController {

    private final CustomerService fooService;

    private final CustomerService barService;

    @Autowired
    public HaHaController(CustomerService fooService, CustomerService barService) {
        this.fooService = fooService;
        this.barService = barService;
    }

    @GetMapping("/ok")
    public void areYouOk() {
        fooService.doNothing();
        barService.doNothing();
    }
}
