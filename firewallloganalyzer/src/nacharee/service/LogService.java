/**
 * 
 */
package nacharee.service;

import java.util.List;

import nacharee.model.LogView;

/**
 * @author Administrator
 *
 */
public interface LogService {
	List<String> getAllLogFileName();
	LogView getLogViewByLogFileName(String logFileName);
}
