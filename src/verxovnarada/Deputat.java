package verxovnarada;

import verxovnarada.Congress;
import verxovnarada.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Deputat implements Comparable<Deputat>{
    private Fio fio;
    private int age;
    private int weight;
    private int height;
    private Set<String> gentlemenSet;
    private boolean xabarnyk;
    private int xabarAmount;
    private ArrayList<Integer> xabar;

    public Deputat(String firstName, String lastName, int age, int weight, int height){
        this.fio = new Fio(firstName,lastName);
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.xabarnyk = true;
        this.xabarAmount = 1000;
//        Congress.registrDeputat(this);
    }


    public String getFirstName(){
        return fio.getFirstname();
    }

    public void setFirstName(String firstName){
        fio.setFirstname(firstName);
    }

    public String getLastName(){
        return fio.getLastname();
    }

    public void setLastName(String lastName){
        fio.setLastname(lastName);
    }

    public int getAge(){
        return age;
    }

    public Fio getFio() {
        return fio;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Set<String> getGentlemenSet() {
        return gentlemenSet;
    }

    public void setGentlemenSet(Set<String> gentlemenSet) {
        this.gentlemenSet = gentlemenSet;
    }

    public ArrayList<Integer> getXabar() {
        return xabar;
    }

    public void setXabar(ArrayList<Integer> xabar) {
        this.xabar = xabar;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isXabarnyk(){
        return xabarnyk;
    }

    public void setXabarnyk(boolean xabarnyk){
        this.xabarnyk = xabarnyk;
    }

    public int getXabarAmount(){
        return xabarAmount;
    }

    public void setXabarAmount(int xabarAmount){
        this.xabarAmount = xabarAmount;
        if (xabarAmount==0){setXabarnyk(false);}
    }

    public void takeXabar(int Amount){
        if (xabarnyk) {
            System.out.println("Введіть суму:");
            int x = new Scanner(System.in).nextInt();
            if (x>5000) {
                System.out.println("Поліція ув'язнить депутата");
            } else {
                xabar.add(x);
            }

        } else {
            System.out.println("цей депутат не бере хабарів");
        }
    }

    @Override
    public int compareTo(Deputat o){
        return fio.compareTo(o.getFio());
    }

    @Override
    public String toString() {
        return "Депутат {" +
                "ПІБ=" + fio.toString() +
                ", вік=" + age +" років" +
                ", вага=" + weight +
                ", ріст=" + height +
                ", джентельменський набір=" + gentlemenSet +
                ", xaбарник=" + xabarnyk +
                ", розмір хабаря=" + xabarAmount +
                ", зафіксовані хабарі=" + xabar +
                '}';
    }
}