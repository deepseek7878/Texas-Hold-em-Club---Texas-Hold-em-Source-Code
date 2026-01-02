package dzdc.core.dto;

import dzdc.core.bi.dto.BaseDto;

import java.util.Date;

public class PlatChannelDto extends BaseDto {
    private Integer id ;
    private String appId;
    private String appName;
    private String channelId;//渠道id
    private String channelName ;//渠道名称
    private Date addTime ;
    private String opeartorName ;//操作人
    
	public Integer getId() {
		return id;
	}
	public String getAppId() {
		return appId;
	}
	public String getAppName() {
		return appName;
	}
	public String getChannelId() {
		return channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public Date getAddTime() {
		return addTime;
	}
	public String getOpeartorName() {
		return opeartorName;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public void setOpeartorName(String opeartorName) {
		this.opeartorName = opeartorName;
	}

}
