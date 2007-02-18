/**
 * 
 */
package nacharee.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * @author Administrator
 *
 */
public class Log implements Serializable {
	
	private static Logger logger = Logger.getLogger( Log.class );

	private static final long serialVersionUID = 5216197920998930113L;

	private Long id;
	
	private Date dateTimeStamp;
	
	private String ip;
	
	private String deviceModel;
	
	private SecurityLevel securityLevel;
	
	private Long typeId;
	
	private String errorType;
	
	private Date startTime;
	
	private Integer duration;
	
	private Integer trafficPolicy;
	
	private String service;
	
	private Integer protocalNumber;
	
	private String srcZone;
	
	private String destZone;
	
	private String polocyAction;
	
	private String vpnId;
	
	private Integer bytesSent;
	
	private Integer bytesReceive;
	
	private Integer srcPort;
	
	private Integer destPort;
	
	private String translatedSrcIp;
	
	private Integer translatedSrcPort;
	
	private String translatedDestIp;
	
	private Integer translatedDestPort;
	
	public Log() {
		// TODO Auto-generated constructor stub
	}
	
	public Log(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	
	private void setId(Long id) {
		this.id = id;
	}

	public Integer getBytesReceive() {
		return bytesReceive;
	}

	public void setBytesReceive(Integer bytesReceive) {
		this.bytesReceive = bytesReceive;
	}

	public Integer getBytesSent() {
		return bytesSent;
	}

	public void setBytesSent(Integer bytesSent) {
		this.bytesSent = bytesSent;
	}

	public Date getDateTimeStamp() {
		return dateTimeStamp;
	}

	public void setDateTimeStamp(Date dateTimeStamp) {
		this.dateTimeStamp = dateTimeStamp;
	}

	public Integer getDestPort() {
		return destPort;
	}

	public void setDestPort(Integer destPort) {
		this.destPort = destPort;
	}

	public String getDestZone() {
		return destZone;
	}

	public void setDestZone(String destZone) {
		this.destZone = destZone;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPolocyAction() {
		return polocyAction;
	}

	public void setPolocyAction(String polocyAction) {
		this.polocyAction = polocyAction;
	}

	public Integer getProtocalNumber() {
		return protocalNumber;
	}

	public void setProtocalNumber(Integer protocalNumber) {
		this.protocalNumber = protocalNumber;
	}

	public SecurityLevel getSecurityLevel() {
		return securityLevel;
	}

	public void setSecurityLevel(SecurityLevel securityLevel) {
		this.securityLevel = securityLevel;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Integer getSrcPort() {
		return srcPort;
	}

	public void setSrcPort(Integer srcPort) {
		this.srcPort = srcPort;
	}

	public String getSrcZone() {
		return srcZone;
	}

	public void setSrcZone(String srcZone) {
		this.srcZone = srcZone;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Integer getTrafficPolicy() {
		return trafficPolicy;
	}

	public void setTrafficPolicy(Integer trafficPolicy) {
		this.trafficPolicy = trafficPolicy;
	}

	public String getTranslatedDestIp() {
		return translatedDestIp;
	}

	public void setTranslatedDestIp(String translatedDestIp) {
		this.translatedDestIp = translatedDestIp;
	}

	public Integer getTranslatedDestPort() {
		return translatedDestPort;
	}

	public void setTranslatedDestPort(Integer translatedDestPort) {
		this.translatedDestPort = translatedDestPort;
	}

	public String getTranslatedSrcIp() {
		return translatedSrcIp;
	}

	public void setTranslatedSrcIp(String translatedSrcIp) {
		this.translatedSrcIp = translatedSrcIp;
	}

	public Integer getTranslatedSrcPort() {
		return translatedSrcPort;
	}

	public void setTranslatedSrcPort(Integer translatedSrcPort) {
		this.translatedSrcPort = translatedSrcPort;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getVpnId() {
		return vpnId;
	}

	public void setVpnId(String vpnId) {
		this.vpnId = vpnId;
	}
	
	
	// ----------------  biz method ----------------
	public String replaceSpaces(String log) {
		
//		log = log.replaceAll("[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9] ", "[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]_");
		int startQuote = log.indexOf("\"");
		int endQuote = log.indexOf("\"", startQuote+1);
		logger.debug(" startQuote = " + startQuote);
		logger.debug(" endQuote = " + endQuote);
		
		String startTime = log.substring(startQuote, endQuote+1);
		logger.debug("start_time = " + startTime);
		
		String newStartTime = startTime.replaceAll(" ", "_");
		logger.debug("new start_time = " + newStartTime);
		
		log = log.replace(startTime, newStartTime);
		log = log.replace("src zone", "src_zone");
		log = log.replace("dst zone", "dst_zone");
		log = log.replace("src port", "src_port");
		log = log.replace("dst port", "dst_port");
		log = log.replace("src-xlated ip", "src-xlated_ip");
		log = log.replace("dst-xlated ip", "dst-xlated_ip");
		
		return log;
	}
	
	public void init(String log) {
		
	}
}
