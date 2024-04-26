package ntu.thu_62132086.bottomnavigation_recylerview;

public class LandScape {
    public LandScape(String zenitsu) {
    }

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }

    public String getLandCaption() {
        return landCaption;
    }

    public void setLandCaption(String landCaption) {
        this.landCaption = landCaption;
    }

    public LandScape(String landImageFileName, String landCaption) {
        this.landImageFileName = landImageFileName;
        this.landCaption = landCaption;
    }

    String landImageFileName;
    String landCaption;
}