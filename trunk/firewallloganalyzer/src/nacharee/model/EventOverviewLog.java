/**
 * 
 */
package nacharee.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jfree.data.category.DefaultCategoryDataset;

import de.laures.cewolf.DatasetProduceException;
import de.laures.cewolf.DatasetProducer;

/**
 * @author Administrator
 *
 */
public class EventOverviewLog implements DatasetProducer {

	private static final long serialVersionUID = 6335549883664983492L;
	private static Logger logger = Logger.getLogger( EventOverviewLog.class );
	
	private final String[] categories = {"fw"};
	private final SecurityLevel[] series = SecurityLevel.values();
	
	private List<Log> logs;
	public void setLogs(List<Log> logs) {
		this.logs = logs;
	}

	/* (non-Javadoc)
	 * @see de.laures.cewolf.DatasetProducer#getProducerId()
	 */
	public String getProducerId() {
		// TODO Auto-generated method stub
		return "EventOverviewLog DataProducer";
	}

	/* (non-Javadoc)
	 * @see de.laures.cewolf.DatasetProducer#hasExpired(java.util.Map, java.util.Date)
	 */
	public boolean hasExpired(Map params, Date since) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see de.laures.cewolf.DatasetProducer#produceDataset(java.util.Map)
	 */
	public Object produceDataset(Map params) throws DatasetProduceException {
		// TODO Auto-generated method stub
//		int emergency=0, alert=0, critical=0, error=0, warning=0, notification=0, information=0, debug=0;
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset() {
			private static final long serialVersionUID = 1177544640186495879L;
			protected void finalize() throws Throwable {
				super.finalize();
				logger.debug(this +" finalized.");
			}
		};
		
//		for(Log log : logs) {
//			switch ( log.getSecurityLevel() ) {
//				case EMERGENCY: emergency++; break;
//				case ALERT: alert++; break;
//				case CRITICAL: critical++; break;
//				case ERROR: error++; break;
//				case WARNING: warning++; break;
//				case NOTIFICATION: notification++; break;
//				case INFORMATION: information++; break;
//				case DEBUG: debug++; break;
//
//				default:;break;
//			}
//		}

		for(Log log : logs) {
			switch ( log.getSecurityLevel() ) {
				case EMERGENCY: SecurityLevel.EMERGENCY.increaseCount(); break;
				case ALERT: SecurityLevel.ALERT.increaseCount(); break;
				case CRITICAL: SecurityLevel.CRITICAL.increaseCount(); break;
				case ERROR: SecurityLevel.ERROR.increaseCount(); break;
				case WARNING: SecurityLevel.WARNING.increaseCount(); break;
				case NOTIFICATION: SecurityLevel.NOTIFICATION.increaseCount(); break;
				case INFORMATION: SecurityLevel.INFORMATION.increaseCount(); break;
				case DEBUG: SecurityLevel.DEBUG.increaseCount(); break;
				default:;break;
			}
		}
		
		for(SecurityLevel sery: series) {
			int y = sery.getCount();
			logger.debug("y of " + sery.getDescription() + " = " + y);
			dataset.addValue(y, sery.getDescription(), categories[0]);
		}
		
		return dataset;
	}

}
