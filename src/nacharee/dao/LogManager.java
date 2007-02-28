/**
 * 
 */
package nacharee.dao;

import java.util.List;

import nacharee.model.Log;

/**
 * @author Administrator
 *
 */
public interface LogManager {
	List<String> findAllLogFileName();
	List<Log> findLogsByLogFileName(String logFileName);
}
