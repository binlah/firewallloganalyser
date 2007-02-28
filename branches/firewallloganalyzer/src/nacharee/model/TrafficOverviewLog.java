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
public class TrafficOverviewLog implements DatasetProducer {

	private static final long serialVersionUID = 1282441796426364140L;
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
		return "TrafficOverviewLog DataProducer";
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
		DefaultCategoryDataset dataset = new DefaultCategoryDataset() {
			private static final long serialVersionUID = 1177544640186495879L;
			protected void finalize() throws Throwable {
				super.finalize();
				logger.debug(this +" finalized.");
			}
		};
		

		return dataset;
	}

}
