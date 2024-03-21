package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log={}", name); // local 환경
        log.debug("debug log={}", name); // dev 환경
        log.info("info log={}", name); // real 환경
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";

    }
}
