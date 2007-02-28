/**
 * 
 */
package nacharee.service;

import java.util.List;

import org.apache.log4j.Logger;

import nacharee.dao.LogManager;
import nacharee.model.EventOverviewLog;
import nacharee.model.Log;
import nacharee.model.TrafficOverviewLog;
import de.laures.cewolf.DatasetProducer;

/**
 * @author Administrator
 *
 */
public class LogServiceImpl implements LogService {
	
	private static Logger logger = Logger.getLogger( LogServiceImpl.class );
	
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
		
		List<Log> logs = logManager.findLogsByLogFileName(logFileName);
		logger.debug("logs size = " + logs.size());
		
		EventOverviewLog producer = new EventOverviewLog();
		producer.setLogs( logs );
		
		return producer;
	}

	public DatasetProducer getTrafficOverviewByLogFileName(String logFileName) {
		// TODO Auto-generated method stub
		
		List<Log> logs = logManager.findLogsByLogFileName(logFileName);
		logger.debug("logs size = " + logs.size());
		
		TrafficOverviewLog producer = new TrafficOverviewLog();
		producer.setLogs( logs );
		
		return producer;
	}

}
