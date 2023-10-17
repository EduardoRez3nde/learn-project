package com.devsuperior.dslearnbds.entities;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson {

    private String textContent;

    private String videoUri;

    public Content() {
        super();
    }

    public Content(Long id, String title, Integer position, String textContent, String videoUri, Section section) {
        super(id, title, position, section);
        this.textContent = textContent;
        this.videoUri = videoUri;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getVideoUri() {
        return videoUri;
    }

    public void setVideoUri(String videoUri) {
        this.videoUri = videoUri;
    }
}
