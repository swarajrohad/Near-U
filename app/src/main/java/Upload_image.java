public class Upload_image {
    private String imgURL ,caption;

    public Upload_image(){

    }
    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Upload_image(String imgURL, String caption) {
        this.imgURL = imgURL;
        this.caption = caption;
    }
}
