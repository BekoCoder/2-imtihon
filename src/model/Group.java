package model;

public class Group {

    private  String groupName;
    private String level;

    public Group(String groupName, String level) {
        this.groupName = groupName;
        this.level = level;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
