
public class FindTopMovies
{
  public static void main(String args[])
  {

    FileIO reader = new FileIO();

    String[] movies = reader.load("movies.csv"); // read in movies.csv file

    int[][] data =  new int[movies.length][2]; // create array for data storage

    String[] ratings = reader.load("ratings.csv"); //read ratings.csv file
      

    // go through ratings.csv and aggregate the data
    for(int k = 0; k < ratings.length; k++)
    {
      String[] myRates = ratings[k].split(",");
      int movieID = Integer.parseInt(myRates[1]);
      int rating = Integer.parseInt(myRates[2]);

      data[movieID - 1][0] += rating;
      data[movieID - 1][1]++;
    }


    // get the movie name and store average rating
    String[][] movie_ratings = new String[movies.length][2];
    for(int i = 0; i < data.length; i++) {
      String[] current_movie = movies[i].split(",");
      movie_ratings[i][0] = current_movie[1].replaceAll("\"", "");

      int average_rating = (data[i][1] != 0) ? data[i][0] / data[i][1] : 0;
      movie_ratings[i][1] = String.valueOf(average_rating);
    } 

    // bubble sort
    String[] tempVar;
    for (int i = 0; i < movie_ratings.length; i++) {
      for(int j = 1; j < movie_ratings.length - i; j++) {
        
        if(Integer.parseInt(movie_ratings[j-1][1]) < Integer.parseInt(movie_ratings[j][1])) {
          tempVar = movie_ratings[j-1];
          movie_ratings[j-1] = movie_ratings[j];
          movie_ratings[j] = tempVar;
        }

      }
    }

    // prepare data for saving
    String[] save = new String[movie_ratings.length];
    for(int i = 0; i < movie_ratings.length; i++) {
      save[i] = movie_ratings[i][0] + "," + movie_ratings[i][1];
    }


    // write to file
    try {
      reader.save("result.csv", save);
    }
    catch (Exception e) {
      System.out.println(e.getClass());
    }


  }
}

