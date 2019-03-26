package com.wzl.spring.chap2.xmlconfig;

import java.util.Set;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    //private List<String> tracks;
    private Set<String> tracks;

/*  public BlankDisc(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }*/

/*  public BlankDisc(String title, String artist, List<String> tracks) {
    this.title = title;
    this.artist = artist;
    this.tracks = tracks;
  }*/

    public BlankDisc(String title, String artist, Set<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("_Track:" + track);
        }
    }

}
