package dzdc.core.dto;

import dzdc.core.enums.LoginStatus;
import dzdc.core.enums.SystemType;
import org.joda.time.DateTime;

/**
 * 
* @ClassName: AdminLoginLogDto
* @Description: TODO(这里用一句话描述这个类的作用)
* @author JohnnyChiu
* @date 2017年8月25日 上午9:55:46
*
 */
public class AdminLoginLogDto {

    private Integer uid;
    private String userName;
    private DateTime loginDate;
    private String loginIp;
    private String loginAddr;
    private SystemType loginSystem;
    private LoginStatus status;
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public DateTime getLoginDate() {
        return loginDate;
    }
    public void setLoginDate(DateTime loginDate) {
        this.loginDate = loginDate;
    }
    public String getLoginIp() {
        return loginIp;
    }
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
    public String getLoginAddr() {
        return loginAddr;
    }
    public void setLoginAddr(String loginAddr) {
        this.loginAddr = loginAddr;
    }
    public SystemType getLoginSystem() {
        return loginSystem;
    }
    public void setLoginSystem(SystemType loginSystem) {
        this.loginSystem = loginSystem;
    }
    public LoginStatus getStatus() {
        return status;
    }
    public void setStatus(LoginStatus status) {
        this.status = status;
    }

	

}
