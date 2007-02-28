package nacharee.model;

import org.apache.log4j.Logger;

import junit.framework.TestCase;

public class LogTest extends TestCase {
	
	private static Logger logger = Logger.getLogger( LogTest.class );
	
	private Log log;
	private String original;
	private String expected;

	protected void setUp() throws Exception {
		super.setUp();
		log = new Log();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public final void testReplaceSpaces() {
		logger.debug("----------------------testReplaceSpaces----------------------");
//		fail("Not yet implemented"); // TODO
		original = "fw: NetScreen device_id=fw  [Root]system-notification-00257(traffic): start_time=\"2007-01-11 10:04:55\" duration=81 policy_id=655 service=udp/port:4661 proto=17 src zone=Trust dst zone=Untrust action=Permit sent=320 rcvd=0 src=10.10.54.78 dst=217.132.113.112 src_port=3480 dst_port=4661 src-xlated ip=203.170.175.6 port=33530 dst-xlated ip=217.132.113.112 port=4661<000>";
		expected = "fw: NetScreen device_id=fw  [Root]system-notification-00257(traffic): start_time=\"2007-01-11_10:04:55\" duration=81 policy_id=655 service=udp/port:4661 proto=17 src_zone=Trust dst_zone=Untrust action=Permit sent=320 rcvd=0 src=10.10.54.78 dst=217.132.113.112 src_port=3480 dst_port=4661 src-xlated_ip=203.170.175.6 port=33530 dst-xlated_ip=217.132.113.112 port=4661<000>";
		
//		String[] originalSplited = original.split(" ");
//		logger.debug("size = " + originalSplited.length + "\n");
//		for(String s: originalSplited) {
//			logger.debug(s);
//		}

		String[] expectedSplited = expected.split(" ");
		logger.debug("size = " + expectedSplited.length + "\n");
		for(String s: expectedSplited) {
			logger.debug(s);
//			System.out.println(s);
		}

		String result = log.replaceSpaces( original );
		logger.debug("result = " + result );
		assertEquals( expected, result );
	}

	public final void testInit() {
		logger.debug("--------------------testInit------------------------");
		original = "2007-01-11 10:06:15	Local0.Notice	10.10.27.1	fw: NetScreen device_id=fw  [Root]system-notification-00257(traffic): start_time=\"2007-01-11 10:05:15\" duration=61 policy_id=731 service=Network Time proto=17 src zone=Trust dst zone=Private action=Permit sent=114 rcvd=114 src=192.168.4.45 dst=10.10.27.11 src_port=123 dst_port=123 src-xlated ip=192.168.4.45 port=123 dst-xlated ip=10.10.27.11 port=123<000>";
		log.init( original );
		
		assertNotNull( log.getSecurityLevel() );
		logger.debug("security level = " + log.getSecurityLevel());
	}
}
