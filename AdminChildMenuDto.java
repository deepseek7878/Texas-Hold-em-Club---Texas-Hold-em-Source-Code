package dzdc.core.dto;

import dzdc.core.enity.AdminPower;

import java.util.List;

/**
 * Created by lghyt on 2017/3/29.
 */
public class AdminChildMenuDto {
    private int id;
    private int sysId;
    private String menuName;
    private int parentId;
    private String url;
    private int sortOrder;
    private List<AdminPower> adminPowerList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSysId() {
        return sysId;
    }

    public void setSysId(int sysId) {
        this.sysId = sysId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public List<AdminPower> getAdminPowerList() {
        return adminPowerList;
    }

    public void setAdminPowerList(List<AdminPower> adminPowerList) {
        this.adminPowerList = adminPowerList;
    }
}
