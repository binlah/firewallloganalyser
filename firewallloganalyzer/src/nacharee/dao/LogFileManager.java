/**
 * 
 */
package nacharee.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import nacharee.model.Log;

/**
 * @author Administrator
 *
 */
public class LogFileManager implements LogManager {
	
	private String logPath;
	
	public void setLogPath(String logPath) {
		this.logPath = logPath;
	}

	/* (non-Javadoc)
	 * @see nacharee.dao.LogManager#findAllLogFileName()
	 */
	public List<String> findAllLogFileName() {
		// TODO Auto-generated method stub
		
		File root = new File(logPath);
		List<String> logFiles = new ArrayList<String>();
		
		if( root.isDirectory() ) {
			String[] files = root.list();
			for(String logFile : files) {
				logFiles.add( logFile );
			}
		}
		
		return logFiles;
	}

	/* (non-Javadoc)
	 * @see nacharee.dao.LogManager#findLogsByLogFileName(java.lang.String)
	 */
	public List<Log> findLogsByLogFileName(String logFileName) {
		// TODO Auto-generated method stub
		List<Log> logs = new ArrayList<Log>();
		
		
		
		return logs;
	}

}
