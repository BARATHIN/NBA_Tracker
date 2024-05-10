package Metier;

public class Utilisateur extends Personne {
    private String username;
    private String password;
    private int grade;

    public Utilisateur(String nom, int age, int taille, String username, String password, int grade) {
        super(nom, age, taille);
        this.username = username;
        this.password = password;
        this.grade = grade;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
