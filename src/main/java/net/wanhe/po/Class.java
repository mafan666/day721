package net.wanhe.po;

public class Class {
    private Integer ClassId;
    private String className;

    public Class() {
    }

    public Class(Integer classId, String className) {
        ClassId = classId;
        this.className = className;
    }

    public Integer getClassId() {
        return ClassId;
    }

    public void setClassId(Integer classId) {
        ClassId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
