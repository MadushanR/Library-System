/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nafla
 */
public class Member {
    private String MemberID,MemberName,MemberAddress,Status,MemberType;
    private int MemberAge,MemberCNumber;

    public Member(String MemberID, String MemberName, String MemberAddress, String Status, String MemberType, int MemberAge, int MemberCNumber) {
        this.MemberID = MemberID;
        this.MemberName = MemberName;
        this.MemberAddress = MemberAddress;
        this.Status = Status;
        this.MemberType = MemberType;
        this.MemberAge = MemberAge;
        this.MemberCNumber = MemberCNumber;
    }

  
   
   

    public String getMemberID() {
        return MemberID;
    }

    public void setMemberID(String MemberID) {
        this.MemberID = MemberID;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public String getMemberAddress() {
        return MemberAddress;
    }

    public void setMemberAddress(String MemberAddress) {
        this.MemberAddress = MemberAddress;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getMemberType() {
        return MemberType;
    }

    public void setMemberType(String MemberType) {
        this.MemberType = MemberType;
    }

    public int getMemberAge() {
        return MemberAge;
    }

    public void setMemberAge(int MemberAge) {
        this.MemberAge = MemberAge;
    }

    public int getMemberCNumber() {
        return MemberCNumber;
    }

    public void setMemberCNumber(int MemberCNumber) {
        this.MemberCNumber = MemberCNumber;
    }
    
}
