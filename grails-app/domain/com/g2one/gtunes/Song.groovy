package com.g2one.gtunes

class Song {
    String title
    String artist
    Integer duration
    Album album
    static constraints = {
    }
    public String toString()
    {
      if( title == null ) return "New"
      else return title
    }
}
