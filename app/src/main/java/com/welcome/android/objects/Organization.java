package com.welcome.android.objects;

import com.google.firebase.database.Exclude;

import java.util.List;

/**
 * Created by Kraji on 1/12/2017.
 */

public class Organization extends FirebaseObject {
    private String title;
    private String description;
    private String coverPhotoUrl;
    private String logoUrl;
    private List<String> memberIds;
    private List<String> adminIds;

    public Organization() {

    }

    @Exclude
    protected void copy(FirebaseObject o) {
        Organization other = null;
        try {
            other = (Organization) o;
        } catch (ClassCastException e) {
            throw new RuntimeException("can't cast object to Organization");
        }

        title = other.title;
        description = other.description;
        coverPhotoUrl = other.coverPhotoUrl;
        logoUrl = other.logoUrl;
        memberIds = other.memberIds;
        adminIds = other.adminIds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public List<String> getMemberIds() {
        return memberIds;
    }

    public void setMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
    }

    public List<String> getAdminIds() {
        return adminIds;
    }

    public void setAdminIds(List<String> adminIds) {
        this.adminIds = adminIds;
    }
}
