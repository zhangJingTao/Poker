package poker.init;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import poker.constant.RedisConstant;
import poker.entity.Menu;
import poker.entity.User;
import poker.entity.UserMenuRelation;
import poker.redis.RedisDao;
import poker.service.menu.MenuService;
import poker.service.menu.UserMenuRelationService;
import poker.test.SerializableVO;
import poker.util.GenerateRandomUtil;
import poker.util.SpringContextHolder;

@Component
@Lazy(value=false)
public class ApplicationInit {
	public static final Log log = LogFactory.getLog(ApplicationInit.class);

	@Autowired
	MenuService menuService;
	@Autowired
	UserMenuRelationService relationService;
	
	@Value(value="${webapp}")
	String webapp;
	
	RedisDao redisDao = new RedisDao();

	
	public ApplicationInit(){
		if (menuService==null) {
			menuService = SpringContextHolder.getBean(MenuService.class);
		}
		if (relationService==null) {
			relationService = SpringContextHolder.getBean(UserMenuRelationService.class);
		}
		log.info("                                 qBMBBBMBMY     ");	
		log.info("                                8BBBBBOBMBMv    ");
		log.info("                              iMBMM5vOY:BMBBv        ");
		log.info("              .r,             OBM;   .: rBBBBBY     ");
		log.info("              vUL             7BB   .;7. LBMMBBM.   ");
		log.info("             .@Wwz.           :uvir .i:.iLMOMOBM..  ");
		log.info("              vv::r;             iY. ...rv,@arqiao. ");
		log.info("               Li. i:             v:.::::7vOBBMBL.. ");
		log.info("               ,i7: vSUi,         :M7.:.,:u08OP. .  ");
		log.info("                 .N2k5u1ju7,..     BMGiiL7   ,i,i.  ");
		log.info("                  :rLjFYjvjLY7r::.  ;v  vr... rE8q;.:,, ");
		log.info("                 751jSLXPFu5uU@guohezou.,1vjY2E8@Yizero.    ");
		log.info("                 BB:FMu rkM8Eq0PFjF15FZ0Xu15F25uuLuu25Gi.   ");
		log.info("               ivSvvXL    :v58ZOGZXF2UUkFSFkU1u125uUJUUZ,   ");
		log.info("             :@kevensun.      ,iY20GOXSUXkSuS2F5XXkUX5SEv.  ");
		log.info("         .:i0BMBMBBOOBMUi;,        ,;8PkFP5NkPXkFqPEqqkZu.  ");
		log.info("       .rqMqBBMOMMBMBBBM .           @kexianli.S11kFSU5q5   ");
		log.info("     .7BBOi1L1MM8BBBOMBB..,          8kqS52XkkU1Uqkk1kUEJ   ");
		log.info("     .;MBZ;iiMBMBMMOBBBu ,           1OkS1F1X5kPP112F51kU   ");
		log.info("       .rPY  OMBMBBBMBB2 ,.          rME5SSSFk1XPqFNkSUPZ,.");
		log.info("              ;;JuBML::r:.:.,,        SZPX0SXSP5kXGNP15UBr.");
		log.info("                  L,    :@huhao.      :MNZqNXqSqXk2E0PSXPE .");
		log.info("              viLBX.,,v8Bj. i:r7:,     2Zkqq0XXSNN0NOXXSXOU ");
		log.info("            :r2. rMBGBMGi .7Y, 1i::i   vO0PMNNSXXEqP@Secbone.");
		log.info("            .i1r. .jkY,    vE. iY....  20Fq0q5X5F1S2F22uuv1M");
		log.info("start init application redis data");
//		redisDao.putValue(RedisConstant.TEST_JSON_KEY_LARGE, generateList(1000000));
//		redisDao.putValue(RedisConstant.TEST_JSON_KEY_MEDIUM, generateList(100000));
//		redisDao.putValue(RedisConstant.TEST_JSON_KEY_SMALL, generateList(1000));
		redisDao.putValue("webapp", "poker");
		
		log.info("finish init application redis data");
		checkRedisIsOK();
	}
	
	
	private Serializable generateList(Integer size){
		List<SerializableVO> result = new ArrayList<SerializableVO>();
		if (size==0) {
			return (Serializable) result;
		}
		GenerateRandomUtil util = new GenerateRandomUtil();
		for (int i = 0; i < size; i++) {
			String generateStr = util.generateRandomChar(10);
			Long generateLong = util.generateRandomLong(8);
			Integer generateInteger = util.generateRandomInt(5);
			Menu menu = new Menu(generateLong, generateLong, generateStr, generateStr, false, generateInteger, generateLong, null, generateLong, generateStr, generateStr);
			User user = new User();
			SerializableVO vo = new SerializableVO(util.generateRandomInt(3),util.generateRandomChar(10),util.generateRandomLong(10), menu, user);
			result.add(vo);
		}
		return (Serializable) result;
	}
	
	private void checkRedisIsOK(){
		try {
			List<SerializableVO> result = (List<SerializableVO>)redisDao.getValue(RedisConstant.TEST_JSON_KEY_LARGE);
			log.info(RedisConstant.TEST_JSON_KEY_LARGE+" cases size is:"+result.size());
			log.info("Redis is Ok!");
		} catch (Exception e) {
		}
	}
}
