package com.suraj.api.model.response;

public class TempFilm {
    private String title;
    private int episode_id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(int episode_id) {
        this.episode_id = episode_id;
    }

    public TempFilm fromFilm(Film film) {
        TempFilm tempFilm = new TempFilm();
        tempFilm.setTitle(film.getTitle());
        tempFilm.setEpisode_id(film.getEpisode_id());
        return tempFilm;
    }
}
