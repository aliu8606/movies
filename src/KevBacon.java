import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class KevBacon {
    private ArrayList<Movie> movies;
    private Scanner scanner;

    public KevBacon(String fileName) throws Exception
    {
        importMovieList(fileName);
        scanner = new Scanner(System.in);

    }

    private void importMovieList(String fileName) throws Exception
    {
        //try
        //{
            // parsing file "JSONExample.json"
            Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));

            // typecasting obj to JSONObject
            JSONObject jo = (JSONObject) obj;

            String title = (String) jo.get("title");
            System.out.println(title);
            /*String cast = movieFromCSV[1];
            String director = movieFromCSV[2];
            String tagline = movieFromCSV[3];
            String keywords = movieFromCSV[4];
            String overview = movieFromCSV[5];
            int runtime = Integer.parseInt(movieFromCSV[6]);
            String genres = movieFromCSV[7];
            double userRating = Double.parseDouble(movieFromCSV[8]);
            int year = Integer.parseInt(movieFromCSV[9]);
            int revenue = Integer.parseInt(movieFromCSV[10]); */

            /*FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            movies = new ArrayList<Movie>();

            while ((line = bufferedReader.readLine()) != null)
            {
                String[] movieFromCSV = line.split(":");

                String title = movieFromCSV[0];
                String cast = movieFromCSV[1];
                String director = movieFromCSV[2];
                String tagline = movieFromCSV[3];
                String keywords = movieFromCSV[4];
                String overview = movieFromCSV[5];
                int runtime = Integer.parseInt(movieFromCSV[6]);
                String genres = movieFromCSV[7];
                double userRating = Double.parseDouble(movieFromCSV[8]);
                int year = Integer.parseInt(movieFromCSV[9]);
                int revenue = Integer.parseInt(movieFromCSV[10]);

                Movie nextMovie = new Movie(title, cast, director, tagline, keywords, overview, runtime, genres, userRating, year, revenue);
                movies.add(nextMovie);
            }
            bufferedReader.close();
        }
        catch(IOException exception)
        {
            // Print out the exception that occurred
            System.out.println("Unable to access " + exception.getMessage());*/
        //}
    }
}
