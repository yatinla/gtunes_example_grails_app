package com.g2one.gtunes

class Album {

    String title
    static hasMany = [songs:Song]
    static constraints = {
    }
    public String toString()
    {
      if( title == null ) return "New"
      else return title
    }
}
