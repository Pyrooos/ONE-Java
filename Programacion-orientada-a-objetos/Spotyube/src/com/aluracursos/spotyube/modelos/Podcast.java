package com.aluracursos.spotyube.modelos;

public class Podcast extends Audio {

    private String channelName;
    private String description;

    @Override
    public int getRating() {
        if(getTotalLikes() >2000){
            return 9;
        } else {
            return 3;
        }
    }

    public String getChannelName() {
        return channelName;
    }
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
