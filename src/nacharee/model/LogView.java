/**
 * 
 */
package nacharee.model;

import java.util.Date;
import java.util.Map;

import de.laures.cewolf.DatasetProduceException;
import de.laures.cewolf.DatasetProducer;

/**
 * @author Administrator
 *
 */
public class LogView implements DatasetProducer {

	private static final long serialVersionUID = 3683130320360787622L;

	/* (non-Javadoc)
	 * @see de.laures.cewolf.DatasetProducer#getProducerId()
	 */
	public String getProducerId() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see de.laures.cewolf.DatasetProducer#hasExpired(java.util.Map, java.util.Date)
	 */
	public boolean hasExpired(Map params, Date date) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see de.laures.cewolf.DatasetProducer#produceDataset(java.util.Map)
	 */
	public Object produceDataset(Map params) throws DatasetProduceException {
		// TODO Auto-generated method stub
		return null;
	}

}
