package syl.camp.springdemo.trash.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import syl.camp.springdemo.trash.CustomerService;

/**
 * @author sunyl
 * @date 2021/9/1 4:03 下午
 * @see syl.camp.springdemo.trash.impl
 */
@Slf4j
@Service("fooService")
public class FooServiceImpl implements CustomerService {

    @Override
    public void doNothing() {
        log.info("【FooService】I just want 躺平躺平躺平～");
    }
}
