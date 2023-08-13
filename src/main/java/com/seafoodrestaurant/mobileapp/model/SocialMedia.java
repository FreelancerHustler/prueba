```java
package com.seafoodrestaurant.mobileapp.model;

public class SocialMedia {

    private String facebookLink;
    private String instagramLink;
    private String twitterLink;

    public SocialMedia(String facebookLink, String instagramLink, String twitterLink) {
        this.facebookLink = facebookLink;
        this.instagramLink = instagramLink;
        this.twitterLink = twitterLink;
    }

    public String getFacebookLink() {
        return facebookLink;
    }

    public void setFacebookLink(String facebookLink) {
        this.facebookLink = facebookLink;
    }

    public String getInstagramLink() {
        return instagramLink;
    }

    public void setInstagramLink(String instagramLink) {
        this.instagramLink = instagramLink;
    }

    public String getTwitterLink() {
        return twitterLink;
    }

    public void setTwitterLink(String twitterLink) {
        this.twitterLink = twitterLink;
    }
}
```