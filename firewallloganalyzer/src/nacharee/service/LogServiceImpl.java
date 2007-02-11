/**
 * 
 */
package nacharee.service;

import java.util.List;

import nacharee.dao.LogManager;
import nacharee.model.LogView;

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

	/* (non-Javadoc)
	 * @see nacharee.service.LogService#getLogViewByLogFileName(java.lang.String)
	 */
	public LogView getLogViewByLogFileName(String logFileName) {
		// TODO Auto-generated method stub
		return null;
	}

}
