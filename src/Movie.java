import java.util.ArrayList;

/**
 * Class that represents a single Movie object
 */
public class Movie
{
    private String title;
    private ArrayList<String> cast;
    private String director;
    private String tagline;
    private String keywords;
    private String overview;
    private int runtime;
    private ArrayList<String> genres;
    private double userRating;
    private int year;
    private int revenue;

    public Movie(String title, String cast, String director, String tagline,
                 String keywords, String overview, int runtime, String genres,
                 double userRating, int year, int revenue)
    {
        this.title = title;
        this.cast = parse(cast);
        this.director = director;
        this.tagline = tagline;
        this.keywords = keywords;
        this.overview = overview;
        this.runtime = runtime;
        this.genres = parse(genres);
        this.userRating = userRating;
        this.year = year;
        this.revenue = revenue;
    }

    public ArrayList<String> parse(String str) {
        ArrayList<String> result = new ArrayList<String>();
        str += "|";

        while (str.indexOf("|") != -1){
            String person = str.substring(0, str.indexOf("|"));
            result.add(person);
            str = str.substring(str.indexOf("|") + 1);
        }

        return result;
    }

    public String getTitle()
    {
        return title;
    }

    public ArrayList<String> getCast()
    {
        return cast;
    }

    public String getDirector()
    {
        return director;
    }

    public String getTagline()
    {
        return tagline;
    }

    public String getKeywords()
    {
        return keywords;
    }

    public String getOverview()
    {
        return overview;
    }

    public int getRuntime()
    {
        return runtime;
    }

    public ArrayList<String> getGenres()
    {
        return genres;
    }

    public double getUserRating()
    {
        return userRating;
    }

    public int getYear()
    {
        return year;
    }

    public int getRevenue()
    {
        return revenue;
    }

    public String toString()
    {
        return "Title: " + title + ", Tagline: " + tagline;
    }
}
