import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try{
            //Create reader to read input file
            BufferedReader in = new BufferedReader(new FileReader("C:/Users/Azriel/IdeaProjects/Movies/src/movies.txt"));
            //Declare object name
            Movies mv;
            //Declare variable that represent each line of data in input file (indata)
            String indata = null;
            while((indata = in.readLine()) != null){
                // Declare StringTokenizer
                StringTokenizer st = new StringTokenizer(indata,";");
                String movieTitle = st.nextToken();
                String date = st.nextToken();
                String directorNames = st.nextToken();
                char categories = st.nextToken().charAt(0);
                boolean isMembership = Boolean.parseBoolean(st.nextToken());

                //Create object and store object (Add object into a storage)
                mv = new Movies(movieTitle,date,directorNames,categories,isMembership);
                System.out.println(mv);
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}