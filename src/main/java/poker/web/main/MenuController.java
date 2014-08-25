package poker.web.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import poker.service.menu.MenuService;

/**
 * 菜单管理
 * <p/>
 * ----note:兴趣不大，不写这东西了
 *
 * @author ZhangJingtao
 */
@Controller
@RequestMapping("/sys/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

}
