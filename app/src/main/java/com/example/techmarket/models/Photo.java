
package com.example.techmarket.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Photo {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("secret")
    @Expose
    private String secret;
    @SerializedName("server")
    @Expose
    private String server;
    @SerializedName("farm")
    @Expose
    private Integer farm;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("ispublic")
    @Expose
    private Integer ispublic;
    @SerializedName("isfriend")
    @Expose
    private Integer isfriend;
    @SerializedName("isfamily")
    @Expose
    private Integer isfamily;
    @SerializedName("datetaken")
    @Expose
    private String datetaken;
    @SerializedName("datetakengranularity")
    @Expose
    private String datetakengranularity;
    @SerializedName("datetakenunknown")
    @Expose
    private String datetakenunknown;
    @SerializedName("url_h")
    @Expose
    private String urlH;
    @SerializedName("height_h")
    @Expose
    private Integer heightH;
    @SerializedName("width_h")
    @Expose
    private Integer widthH;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Photo() {
    }

    /**
     * 
     * @param owner
     * @param server
     * @param widthH
     * @param isfriend
     * @param datetakengranularity
     * @param secret
     * @param title
     * @param isfamily
     * @param urlH
     * @param datetaken
     * @param ispublic
     * @param heightH
     * @param farm
     * @param id
     * @param datetakenunknown
     */
    public Photo(String id, String owner, String secret, String server, Integer farm, String title, Integer ispublic, Integer isfriend, Integer isfamily, String datetaken, String datetakengranularity, String datetakenunknown, String urlH, Integer heightH, Integer widthH) {
        super();
        this.id = id;
        this.owner = owner;
        this.secret = secret;
        this.server = server;
        this.farm = farm;
        this.title = title;
        this.ispublic = ispublic;
        this.isfriend = isfriend;
        this.isfamily = isfamily;
        this.datetaken = datetaken;
        this.datetakengranularity = datetakengranularity;
        this.datetakenunknown = datetakenunknown;
        this.urlH = urlH;
        this.heightH = heightH;
        this.widthH = widthH;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Integer getFarm() {
        return farm;
    }

    public void setFarm(Integer farm) {
        this.farm = farm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIspublic() {
        return ispublic;
    }

    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    public Integer getIsfriend() {
        return isfriend;
    }

    public void setIsfriend(Integer isfriend) {
        this.isfriend = isfriend;
    }

    public Integer getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(Integer isfamily) {
        this.isfamily = isfamily;
    }

    public String getDatetaken() {
        return datetaken;
    }

    public void setDatetaken(String datetaken) {
        this.datetaken = datetaken;
    }

    public String getDatetakengranularity() {
        return datetakengranularity;
    }

    public void setDatetakengranularity(String datetakengranularity) {
        this.datetakengranularity = datetakengranularity;
    }

    public String getDatetakenunknown() {
        return datetakenunknown;
    }

    public void setDatetakenunknown(String datetakenunknown) {
        this.datetakenunknown = datetakenunknown;
    }

    public String getUrlH() {
        return urlH;
    }

    public void setUrlH(String urlH) {
        this.urlH = urlH;
    }

    public Integer getHeightH() {
        return heightH;
    }

    public void setHeightH(Integer heightH) {
        this.heightH = heightH;
    }

    public Integer getWidthH() {
        return widthH;
    }

    public void setWidthH(Integer widthH) {
        this.widthH = widthH;
    }

}
