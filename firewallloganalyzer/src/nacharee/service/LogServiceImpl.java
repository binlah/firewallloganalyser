/**
 * 
 */
package nacharee.service;

import java.util.List;

import nacharee.dao.LogManager;
import nacharee.model.EventOverviewLog;
import nacharee.model.Log;
import de.laures.cewolf.DatasetProducer;

/**
 * @author Administrator
 *
 */
public class LogServiceImpl implements LogService {
	
	private LogManager logManager;
	public void setLogManager(LogManager logManager) {
		this.logManager = logManager;
	}

	/* (non-Javadoc)
	 * @see nacharee.service.LogService#getAllLogFileName()
	 */
	public List<String> getAllLogFileName() {
		// TODO Auto-generated method stub
		return null;
	}

	public DatasetProducer getEventOverviewByLogFileName(String logFileName) {
		// TODO Auto-generated method stub
		
		List<Log> logs = logManager.findLogsByLogFileName("");
		DatasetProducer producer = new EventOverviewLog();
		
		return producer;
	}

	public DatasetProducer getTrafficOverviewByLogFileName(String logFileName) {
		// TODO Auto-generated method stub
		
		List<Log> logs = logManager.findLogsByLogFileName("");
		
		return null;
	}

}
