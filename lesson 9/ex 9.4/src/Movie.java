public class Movie {
     String title;
     String desc;
     int year;
    public Movie(String title ,String desc ,int year){
        this.title=title;
        this.desc=desc;
        this.year=year;
    }
    public Movie(String title ,int year ){
        this.title=title;
        this.desc="Empty";
                this.year=year;
    }
}

