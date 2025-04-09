package ex_28_ENUM;

public enum LAB211_APIURLs {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    LAB211_APIURLs(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }


}

