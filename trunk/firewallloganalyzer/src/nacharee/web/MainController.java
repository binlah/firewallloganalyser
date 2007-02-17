/**
 * 
 */
package nacharee.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nacharee.service.LogService;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import de.laures.cewolf.DatasetProducer;

/**
 * @author Administrator
 *
 */
public class MainController extends MultiActionController implements InitializingBean {

	private LogService logService;
	public void setLogService(LogService logService) {
		this.logService = logService;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	public MainController() {
		// TODO Auto-generated constructor stub
	}

	public ModelAndView trafficOverviewHandler(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView();
	}

	public ModelAndView eventOverviewHandler(HttpServletRequest request, HttpServletResponse response) {
		
		DatasetProducer datasetProducer = logService.getEventOverviewByLogFileName("");

//		DatasetProducer datasetProducer = new PageViewCountData();
		
		return new ModelAndView().addObject("event", datasetProducer);
	}
	
	
}
