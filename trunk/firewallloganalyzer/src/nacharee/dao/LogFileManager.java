/**
 * 
 */
package nacharee.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import nacharee.model.Log;

/**
 * @author Administrator
 *
 */
public class LogFileManager implements LogManager {

	private static Logger logger = Logger.getLogger( LogFileManager.class );

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
			File[] files = root.listFiles();
			for(File logFile : files) {
				if( logFile.isFile() ) {
					logFiles.add( logFile.getName() );
				}
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

		try {
			File file = new File( logPath + "\\" + logFileName);
			BufferedReader in  = new BufferedReader( new FileReader(file) );

			String line = null;
			while ((line = in.readLine()) != null) {
				Log log = new Log();
				log.init( line );				
				logs.add( log );
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error( e.getMessage() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error( e.getMessage() );
		}

		return logs;
	}

}
