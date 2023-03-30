package br.com.testeapispring.distrolinuxapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mostPopularDistros")
public class DistroLinux {

    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;

    public DistroLinux(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public DistroLinux() {

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

    public String getId() {
        return id;
    }
}
