/**
 * 
 */
package nacharee.dao;

import java.util.List;

import nacharee.model.Log;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 */
public class LogManagerTestCase extends TestCase {
	
	private LogManager logManager;
	private String path;

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		logManager = new LogFileManager();
		path = "D:/Project/Project 8 - Firewall Log Analyzer/Source/firewallloganalyzer/WebContent/log";
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		logManager = null;
		path = null;
	}

	/**
	 * Test method for {@link nacharee.dao.LogFileManager#findAllLogFileName()}.
	 */
	public final void testFindAllLogFileName() {
//		fail("Not yet implemented"); // TODO
		List<String> logFiles = logManager.findAllLogFileName();
		assertNotNull( logFiles );
		assertFalse( logFiles.isEmpty() );
		assertEquals(3, logFiles.size());
	}

	/**
	 * Test method for {@link nacharee.dao.LogFileManager#findLogsByLogFileName(java.lang.String)}.
	 */
	public final void testFindLogsByLogFileName() {
//		fail("Not yet implemented"); // TODO
		List<Log> logs = logManager.findLogsByLogFileName("sample-logging-on-FW.txt");
		// log has 1589 lines
		assertNotNull( logs );
		assertFalse( logs.isEmpty() );
		assertEquals( 1589, logs.size() );
		assertEquals( Log.class, logs.get(0).getClass());
	}

}
