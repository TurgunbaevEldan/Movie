import java.util.Scanner;

public class Movies implements Findable {

    @Override
    public void getAllMovies(Movie[] movies) {
        for (Movie m : movies) {
                System.out.println(m);
        }
    }


    @Override
    public void findMovieByName(Movie[] movies) {
        System.out.println("Назваение фильма: ");
        String a = new Scanner(System.in).nextLine();
        for (Movie n : movies) {
            if (n.getName().equalsIgnoreCase(a)) {
                System.out.println(n);
            }
        }
    }

    @Override
    public void findMovieByActorName(Movie[] movies) {
        System.out.println("Имя актёра: ");
        String f = new Scanner(System.in).nextLine();
        for (Movie k : movies) {
            for (Cast c : k.getCasts()) {
                if (c.getActorFullName().equalsIgnoreCase(f)) {
                    System.out.println(k);
                }
            }
        }
    }

    @Override
    public void findMovieByYear(Movie[] movies) {
        System.out.println("Год выпуска: ");
        int l = new Scanner(System.in).nextInt();
        for (Movie w : movies) {
            if (w.getYear()==l) {
                System.out.println(w);
            }
        }
    }
    @Override
    public void findMovieByDirector(Movie[] movies) {
        System.out.println("Имя директора: ");
        String r = new Scanner(System.in).nextLine();
        for (Movie j : movies) {
            if (j.getDirector().getName().equalsIgnoreCase(r)) {
                System.out.println(j);
            }
        }
    }
    @Override
    public void findMovieByDescription(Movie[] movies) {
        System.out.println("Название жанра: ");
        String p = new Scanner(System.in).nextLine();
        for (Movie d : movies) {
            if (d.getDescription().equalsIgnoreCase(p)) {
                System.out.println(d);
            }
        }
    }
    @Override
    public void findMovieByRole(Movie[] movies) {
        System.out.println("Роль:");
        String x = new Scanner (System.in).nextLine();
        for (Movie o:movies) {
            for (Cast c: o.getCasts()) {
                if (c.getRole().equalsIgnoreCase(x)){
                    System.out.println(o);
                }
            }
        }
    }
}
