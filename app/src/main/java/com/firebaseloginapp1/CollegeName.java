package com.firebaseloginapp1;

/**
 * Created by n01139945 on 10/23/2017.
 */

public class CollegeName {
    String collegenameid;
    String collegenameCollegeName1;

    public CollegeName(){

    }

    public CollegeName(String collegenameid, String collegenameCollegeName1) {
        this.collegenameid = collegenameid;
        this.collegenameCollegeName1 = collegenameCollegeName1;
    }

    public String getCollegenameid() {
        return collegenameid;
    }

    public String getCollegenameCollegeName1() {
        return collegenameCollegeName1;
    }
}
