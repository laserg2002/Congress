package verxovnarada;

/**
 * Created by ссс on 29.06.2017.
 */
public class Fio implements Comparable<Fio>{
    private String firstname;
    private String lastname;

    public Fio(String firstname, String lastname){
        this.firstname = firstname.trim();
        this.lastname = lastname.trim();
    }

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    @Override
    public String toString(){
        return "Fio{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fio)) return false;

        Fio fio = (Fio) o;

        if (firstname != null ? !firstname.equals(fio.firstname) : fio.firstname != null) return false;
        return lastname != null ? lastname.equals(fio.lastname) : fio.lastname == null;
    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Fio o){
        return lastname.compareTo(o.getLastname());
    }
}


