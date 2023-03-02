import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Movie:
         * private String name;
         * private int year;
         * private String description;
         * private Director director;
         * private Cast[] casts;
         *
         * Cast:
         * private String actorFullName;
         * private String role;
         *
         * Director:
         * private String name;
         * private String lastName;
         *
         * Findable деген Interface тузунуз методдору:
         *
         * void getAllMovies(Movie[] movies);
         * void findMovieByName(Movie[] movies);
         * void findMovieByActorName(Movie[] movies);
         * void findMovieByYear(Movie[] movies);
         * void findMovieByDirector(Movie[] movies);
         * void findMovieByDescription(Movie[] movies);
         * void findMovieByRole(Movie[] movies);
         *
         * * Main де кайсыл иш аракетти аткаргыбыз келсе ошол метод switch case аркылуу чакырылып иштесин.
         *       Бардык маалыматтар туура жана так болуп консольго чыксын.
         */
        Cast cast = new Cast("Иван Массаге","Герой");
        Cast cast1 = new Cast("Зоррион Экуелеор","больной");
        Cast[] platformCasts = {cast,cast1};

        Cast cast2 = new Cast("Назар Бердигулов","Тима");
        Cast cast3 = new Cast("Самет Оспаналиев","Тиля");
        Cast[] zombieCasts = {cast2,cast3};

        Cast cast4 = new Cast("Азамат Уланов","Сын");
        Cast cast5 = new Cast("Майкл Мапонга","Ти");
        Cast[] searchCasts = {cast4,cast5};

        Director director = new Director("Гальдер"," Гастелу-Уррутия");
        Director director1 = new Director("Данияр","Болотбеков");
        Director director2 = new Director("Эрмек","Таалайбеков");

        Movie movie = new Movie("Платформа",2019,"Научно-фантастический фильм",director,platformCasts);
        Movie movie1 = new Movie("Зомбеты",2021,"фильм ужасов",director1,zombieCasts);
        Movie movie2 = new Movie("В поисках мамы",2017,"Комедия",director2,searchCasts);

        Movie [] movies={movie,movie1,movie2};
        Movies movies1=new Movies();

        while (true){
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1 -> movies1.getAllMovies(movies);
            case 2 -> movies1.findMovieByName(movies);
            case 3 -> movies1.findMovieByActorName(movies);
            case 4 -> movies1.findMovieByDirector(movies);
            case 5 -> movies1.findMovieByYear(movies);
            case 6 -> movies1.findMovieByDescription(movies);
            case 7 -> movies1.findMovieByRole(movies);
        }
        }
    }

}