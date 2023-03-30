package br.com.testeapispring.distrolinuxapi;

public class DistroLinux {

    private String title;
    private String image;
    private int ranking;

    public DistroLinux(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public int getRanking() {
        return ranking;
    }
}
