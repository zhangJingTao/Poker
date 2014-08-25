package poker.web.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangJingtao
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {

    @RequestMapping(value = "")
    public String list() {
        return "share/main";
    }

    @RequestMapping(value = "target")
    public String target() {
        return "share/targetMain";
    }


}
