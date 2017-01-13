package com.example.gokul.signinapp_1_8.objects;

import java.util.List;
import java.util.Map;

/**
 * Created by Kraji on 1/12/2017.
 */

public class User extends FirebaseObject {
    private String name;
    private String email;
    private String profPicUrl;
    private List<String> memberOrganizationIds;
    private List<String> adminOrganizationIds;
    private Long birthday;
    private String phoneNumber;
    private String race;
    private String gender;
    private String occupation;
    private String school;
    private String major;
    private String year;
    private String company;
    private String jobTitle;

    @Exclude
    private FirebaseUser auth;

    public User() {

    }

    @Exclude
    public Task signup(Map<String, Object> attrs) {
        Task t1 = getRef().set(attrs);
        Task t2 = pullFromDB();
        return null; // TODO: do t2 after t1
    }

    @Exclude
    public void logout() {
        // TODO: ...
        auth = null;
    }

    @Exclude
    public void login(String email, String password) {
        // TODO: set auth
    }

    @Exclude
    public FirebaseUser getAuth() {
        return auth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfPicUrl() {
        return profPicUrl;
    }

    public void setProfPicUrl(String profPicUrl) {
        this.profPicUrl = profPicUrl;
    }

    public List<String> getMemberOrganizationIds() {
        return memberOrganizationIds;
    }

    public void setMemberOrganizationIds(List<String> memberOrganizationIds) {
        this.memberOrganizationIds = memberOrganizationIds;
    }

    public List<String> getAdminOrganizationIds() {
        return adminOrganizationIds;
    }

    public void setAdminOrganizationIds(List<String> adminOrganizationIds) {
        this.adminOrganizationIds = adminOrganizationIds;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


}
