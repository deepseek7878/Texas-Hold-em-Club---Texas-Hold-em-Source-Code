package dzdc.core.dto;

import dzdc.core.enums.DepartmentProperty;
import org.joda.time.DateTime;

public class AdminUserDto {
  //id
    private int id;

    //用户名
    private String userName;

    //密码
    private String password;

    private int departmentId;
    private DepartmentProperty departmentProperty;

    //是否锁定
    private boolean hasLock;

    //创建时间
    private DateTime createDate;

    private String realName;

    //手机号码
    private String mobile;
    //输入密码错误次数
    private int errorCount;
    
    private DateTime lastModifyDate;
    private DateTime lastLoginDate;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public boolean isHasLock() {
        return hasLock;
    }
    public void setHasLock(boolean hasLock) {
        this.hasLock = hasLock;
    }
    public DateTime getCreateDate() {
        return createDate;
    }
    public void setCreateDate(DateTime createDate) {
        this.createDate = createDate;
    }
    public String getRealName() {
        return realName;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public int getErrorCount() {
        return errorCount;
    }
    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }
    public DateTime getLastModifyDate() {
        return lastModifyDate;
    }
    public void setLastModifyDate(DateTime lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
    public DateTime getLastLoginDate() {
        return lastLoginDate;
    }
    public void setLastLoginDate(DateTime lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
    public DepartmentProperty getDepartmentProperty() {
        return departmentProperty;
    }
    public void setDepartmentProperty(DepartmentProperty departmentProperty) {
        this.departmentProperty = departmentProperty;
    }
    
    
}
