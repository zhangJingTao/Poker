package poker.web.main;

import java.util.Map;

import javax.servlet.ServletRequest;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springside.modules.web.Servlets;

import poker.entity.Task;

/**
 * 
 * @author ZhangJingtao
 *
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {
	
	@RequestMapping(value = "")
	public String list() {
		return "share/main";
	} 
	
	
}
