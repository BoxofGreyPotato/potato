package _2domashka;

public class Passport implements Comparable<Passport>{


    private String fio;
    private String job;
    private boolean isPassed;
    private int number;


    public Passport(int number, String fio, String job, boolean isPassed){
        this.number=number;
        this.fio=" "+fio;
        this.job=" "+job+" ";
        this.isPassed=isPassed;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    @Override
    public int compareTo(Passport o){
        return fio.compareTo(o.getFio());
    }
    @Override
    public String toString() {
        return number + fio + job + isPassed;
    }
}
