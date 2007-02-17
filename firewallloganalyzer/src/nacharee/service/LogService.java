/**
 * 
 */
package nacharee.service;

import java.util.List;

import de.laures.cewolf.DatasetProducer;

/**
 * @author Administrator
 *
 */
public interface LogService {
	List<String> getAllLogFileName();
	DatasetProducer getTrafficOverviewByLogFileName(String logFileName);
	DatasetProducer getEventOverviewByLogFileName(String logFileName);
}
