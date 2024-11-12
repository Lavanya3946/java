package com.xworkz.playStore.Application;

public class ApplicationDto {

    private int id;
    private String name;
    private String version;
    private String size;
    private int ratings;
    private int noOfDownloads;
    private String feedbacks;

    public ApplicationDto(int id, String name, String version, String size, int ratings, int noOfDownloads, String feedbacks) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.size = size;
        this.ratings = ratings;
        this.noOfDownloads = noOfDownloads;
        this.feedbacks = feedbacks;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getNoOfDownloads() {
        return noOfDownloads;
    }

    public void setNoOfDownloads(int noOfDownloads) {
        this.noOfDownloads = noOfDownloads;
    }

    public String getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(String feedbacks) {
        this.feedbacks = feedbacks;
    }

    @Override
    public String toString() {
        return "ApplicationDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", size='" + size + '\'' +
                ", ratings='" + ratings + '\'' +
                ", noOfDownloads=" + noOfDownloads +
                ", feedbacks='" + feedbacks + '\'' +
                '}';
    }
    public  void checkRating(){
        if(this.ratings<3){
            System.out.println("ratings are good..");
        }
        else {
            System.out.println("rating are poor..");
        }
    }
}

