package com.elhady.expandrecyclerview.model;

public class Expender {
    private String codeName, version, apiLevel, descripion;
    private boolean expandable;

    public Expender(String codeName, String version, String apiLevel, String descripion) {
        this.codeName = codeName;
        this.version = version;
        this.apiLevel = apiLevel;
        this.descripion = descripion;
        this.expandable = false;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApiLevel() {
        return apiLevel;
    }

    public void setApiLevel(String apiLevel) {
        this.apiLevel = apiLevel;
    }


    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    @Override
    public String toString() {
        return "Versions{" +
                "codeName='" + codeName + '\'' +
                ", version='" + version + '\'' +
                ", apiLevel='" + apiLevel + '\'' +
                ", descripion='" + descripion + '\'' +
                '}';
    }
}
