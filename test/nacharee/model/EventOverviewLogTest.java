/**
 * 
 */
package nacharee.model;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 */
public class EventOverviewLogTest extends TestCase {
	
	private EventOverviewLog eventOverviewLog;
	private List<Log> logs;

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		logs = new ArrayList<Log>();
		eventOverviewLog = new EventOverviewLog();
		eventOverviewLog.setLogs( logs );
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		logs = null;
	}

	/**
	 * Test method for {@link nacharee.model.EventOverviewLog#produceDataset(java.util.Map)}.
	 */
	public final void testProduceDataset() {
		fail("Not yet implemented"); // TODO
	}

}
