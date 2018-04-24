package util;


public enum URLs {

    RC("http://backoffice.despegar.com/cfa-tinder-rc/web/#/summary"),
    BETA("http://backoffice.despegar.com/cfa-follower-view-beta/#/auth/login"),
    IC("http://ic.backoffice.despegar.it/cfa-follower-view/#/app/search"),
    PROD("http://backoffice.despegar.com/cfa-follower-view/#/auth/login");

    private String url;

    private URLs (String url){
        this.url = url;
    }

    public String getUrl(){
        return this.url;
    }
}
