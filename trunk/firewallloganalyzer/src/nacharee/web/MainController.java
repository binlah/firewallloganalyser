/**
 * 
 */
package nacharee.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nacharee.model.sample.PageViewCountData;
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
		if( logService == null) {
			throw new IllegalArgumentException("Must set logService bean property on " + getClass());
		}
	}

	/**
	 * 
	 */
	public MainController() {
		// TODO Auto-generated constructor stub
	}

	public ModelAndView trafficOverviewHandler(HttpServletRequest request, HttpServletResponse response) {
		DatasetProducer datasetProducer = logService.getEventOverviewByLogFileName("sample-logging-on-FW.txt");
		return new ModelAndView().addObject("traffic", datasetProducer);
	}

	public ModelAndView eventOverviewHandler(HttpServletRequest request, HttpServletResponse response) {
		
		DatasetProducer datasetProducer = logService.getEventOverviewByLogFileName("sample-logging-on-FW.txt");
//		DatasetProducer datasetProducer = new PageViewCountData();
		
		return new ModelAndView().addObject("event", datasetProducer);
	}
	
	
}
