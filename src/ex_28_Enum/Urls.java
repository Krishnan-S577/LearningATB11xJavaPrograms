package ex_28_Enum;

public enum Urls {
        vwo("https://app.vwo.com"),
        katalon("https://katalon.com"),
        google("https://google.com");

        private String url;

        Urls(String url){
            this.url = url;
        }

        String getUrl(){
            return this.url;
        }
}
