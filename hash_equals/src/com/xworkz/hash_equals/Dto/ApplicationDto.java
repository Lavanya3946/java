package com.xworkz.hash_equals.Dto;

import java.util.Objects;

public class ApplicationDto {
    private String  name;
    private  int version;
    private  double size;
    private  String type;

    public void ApplicationDto(){

    }

    public ApplicationDto(String name, int version, double size, String type) {
        this.name = name;
        this.version = version;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ApplicationDto)) return false;
        ApplicationDto that = (ApplicationDto) o;
        return Double.compare(size, that.size) == 0 && Objects.equals(name, that.name) && Objects.equals(version, that.version) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, size, type);
    }
}
