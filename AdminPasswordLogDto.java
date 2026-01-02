package dzdc.core.dto;

import dzdc.core.enums.PasswordStatus;
import org.joda.time.DateTime;

/**
 * 
* @ClassName: AdminPasswordLogDto
* @Description: TODO(这里用一句话描述这个类的作用)
* @author JohnnyChiu
* @date 2017年8月25日 上午9:57:21
*
 */
public class AdminPasswordLogDto {

    private Integer uid;
    private String userName;
    private PasswordStatus status;
    private DateTime modifyDate;
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
    public PasswordStatus getStatus() {
        return status;
    }
    public void setStatus(PasswordStatus status) {
        this.status = status;
    }
    public DateTime getModifyDate() {
        return modifyDate;
    }
    public void setModifyDate(DateTime modifyDate) {
        this.modifyDate = modifyDate;
    }

	

}
