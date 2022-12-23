package service;

import model.Branch;

public class BranchService {

    Branch [] branches=new Branch[4];
    private int index=0;

    public Branch checkbranch(String name){
        for ( Branch branch: branches) {
            if(branch!=null){
                if(branch.getName().equals(name)){
                    return branch;
                }
            }
        }
        return null;

    }

    public boolean AddBranch(String name){
        for (Branch branch: branches) {
            if(branch!=null){
                if(branch.getName().equals(name)){
                    return false;
                }
            }
        }
        this.branches[index++]=new Branch(name);
        return true;
    }

}
