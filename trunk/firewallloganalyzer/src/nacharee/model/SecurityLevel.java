/**
 * 
 */
package nacharee.model;

/**
 * @author Administrator
 *
 */
public enum SecurityLevel {
 	EMERGENCY("emergency"),
 	ALERT("alert"),
 	CRITICAL("critical"),
 	ERROR("error"),
 	WARNING("warning"),
 	NOTIFICATION("notification"),
 	INFORMATION("information"),
	DEBUG("debug");
	
	private String description;
	private int count;
	
	public String getDescription() {
		return description;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void increaseCount() {
		this.count++;
	}

	private SecurityLevel(String description) {
		this.description = description;
	}
}
