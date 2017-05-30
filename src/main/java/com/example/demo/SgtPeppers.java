package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by AnruiSOUL on 5/29/2017.
 */

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title +  " by " + artist);
    }
}
