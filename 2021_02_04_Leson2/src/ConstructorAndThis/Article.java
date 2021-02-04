package ConstructorAndThis;

public class Article {

    String title;
    String announce;
    String fulltext;
    int id;

//    public Article() {
//        title = "unknown";
//        announce = "Announce her";
//        fulltext = "unknown";
//    }

    public Article(String articleTitle, String articleAnnounce) {
        title = articleTitle;
        announce = articleAnnounce;
    }

    public Article(int articleID, String articleTitle, String articleAnnounce){
        id=articleID;
        title = articleTitle;
        announce = articleAnnounce;
    }

}
