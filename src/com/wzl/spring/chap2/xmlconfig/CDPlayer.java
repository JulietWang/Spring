package com.wzl.spring.chap2.xmlconfig;

public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

/*  @Autowired
  public CDPlayer(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }*/

    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }

}
