package service;

import model.Group;

public class GroupService {

    Group [] groupList=new Group[10];
    private int index=0;
    public boolean addGroup(String name, String level){
        for (Group group: groupList) {
            if(group!=null){
                if(group.getGroupName().equals(name)){
                    return false;
                }
            }
        }
        this.groupList[index++]=new Group(name, level);
        return true;
    }


}
