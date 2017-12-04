package verxovnarada;

import java.util.*;

import static verxovnarada.Main.vr;

/**
 * Created by ссс on 26.06.2017.
 */
public class Fraction implements Comparable<Fraction>{
    private String name;
    private Integer id;
    private HashMap<Integer, Deputat> fractionDeputats = new HashMap<Integer, Deputat>();


    public Fraction(String name){
        this.name = name;
    }


    public Deputat findDeputatInFractionByName(Fio fio){
        if (fractionDeputats.isEmpty()){
            return null;
        }
        return fractionDeputats.get(fio.hashCode());
    }

    public boolean isDeputatInFraction(Deputat dp){
        if (fractionDeputats.isEmpty()){
            return false;
        }
            return fractionDeputats.containsKey(dp.getFio().hashCode());
    }

    public void addDeputat(Deputat dp){
        fractionDeputats.put(dp.getFio().hashCode(),dp);
    }

//////////////////////////////////////////
//    public void moveDeputat(Deputat dp){
//        addDeputat(dp);
//        Congress.removeFromNoNameFraction(dp);
//    }

//    public void setFractionDeputats(Collection<Deputat> frDeputats) {
//        for (Deputat d : frDeputats) {
//            moveDeputat(d);
//        }
//    }

    public Collection<Deputat> getFractionDeputats(){
        if (fractionDeputats.isEmpty()){
            return null;
        }
        return fractionDeputats.values();
    }

    public void justRemoveDeputat(Deputat dp){
        fractionDeputats.remove(dp.getFio().hashCode());
    }

    public void removeDeputat(Deputat dp){
        if (!isDeputatInFraction(dp)){
            System.out.println("нема такого депутата в цій фракції");
            return;
        }
        fractionDeputats.remove(dp.getFio().hashCode());
        Congress.registrDeputat(dp);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printAllDeputats(){
        if (fractionDeputats.isEmpty()) {
            return;
        }
        System.out.println(this);
        for (Deputat d: getFractionDeputats()) {
                  System.out.println(d);
        }
    }

    public void printAllXabarnyk(){
        if (fractionDeputats.isEmpty()) {
            return;
        }
        System.out.println(this);
        for (Deputat d: getFractionDeputats()) {
            if (d.isXabarnyk() == true){
            System.out.println(d);
            }
        }
    }

    public void printBiggestXabarnyk(){
        if (fractionDeputats.isEmpty()) {
            System.out.println("В "+this+ " немає депутатів");
            return;
        }
        Deputat dMax=findBiggestXabarnyk();
        if (dMax==null){
            System.out.println("В "+this+ "немає хабарників");
            return;
        }
        System.out.println("Найбільший хабарник в "+this+ " : ");
        System.out.println(dMax);

    }
    public Deputat findBiggestXabarnyk(){
        int max = 0;
        Deputat dMax = null;
        for (Deputat d: getFractionDeputats()) {
            if (d.getXabarAmount() > max){
                dMax = d;
                max=d.getXabarAmount();
            }
        }
        return dMax;


    }

        public int compareTo(Fraction fr){

        return name.compareTo(fr.getName());
    }


    //    //todo//
//    public void clearAllDeputats{}





    @Override
    public String toString(){
        return "фракція{" +
                 name + "}";
    }
}
