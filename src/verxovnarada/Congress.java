package verxovnarada;


import jdk.nashorn.internal.objects.annotations.Function;

import java.util.*;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Created by ссс on 26.06.2017.
 */
public class Congress {
    private static Congress verxovnaRada;
    private static TreeSet<Fraction> fractionsList = new TreeSet<Fraction>();
    private static final String OUTOFFRACTION = " Позафракційні";

    public static Fraction noNameFraction = new Fraction(OUTOFFRACTION);

    public static UnaryOperator<String> inputFactory = (String T)-> {
        Scanner in = new Scanner(System.in);
        System.out.println(T+": ");
        String name = in.next().trim();
        if (name.isEmpty()) return null;
        return name;
    };

    private Congress(){
    }

    public static Congress getVerhovnaRada() {
        fractionsList.add(noNameFraction);
        return verxovnaRada;
    }

//FIND//////////////////////////////////////
    public static void registrDeputat(Deputat deputat){
        noNameFraction.addDeputat(deputat);
        deputat.setXabarAmount(1000);
        deputat.setXabarnyk(true);
    }

    public static Deputat findDeputatInVerxovnaRada(Fio fio){
        Deputat d;
        for (Fraction fr : fractionsList) {
            d=fr.findDeputatInFractionByName(fio);
            if (d != null){
                return d;
            }
        }
        return null;
    }

    public static Fraction isFraction(String f){
        for (Fraction d : fractionsList) {
            if (d.getName().equals(f)) {
                return d; }
        }
        return null;
    }

    public boolean isOutOfFraction(Deputat dp) {
        return noNameFraction.isDeputatInFraction(dp);
    }

    public static void removeFromNoNameFraction(Deputat dp){
        noNameFraction.removeDeputat(dp);
    }



    public static String inputFractionName () {
        String x1 = inputFactory.apply("Введіть назву фракції або 0 для виходу");
        if ((x1=="0") ) return null;
        return x1;
    }

    public static TreeSet<Fraction> getFractionsList(){
        return fractionsList;
    }

    public static Fio inputNameAndLastName () {
                String x1 = inputFactory.apply("Введіть прізвище депутата або 0 для виходу");
                if (x1=="0") return null;
                String x2 = inputFactory.apply("Введіть ім'я депутата або 0 для виходу");
                if (x2=="0") return null;
                return new Fio(x2, x1);
    }

//    ADD//////////////////////////////////


    public static void moveDeputatToFraction(
            Deputat d, Fraction f){
        f.addDeputat(d);
        noNameFraction.justRemoveDeputat(d);
    }



    public void moveDeputatToFractionByName(){
        String fractionName = this.inputFractionName();
        if (fractionName==null) return;
        Fraction fr = isFraction(fractionName);
        if (fr == null) {
            System.out.println("fraction not exist");
            return;
        }
        Fio fio= inputNameAndLastName();
        if (fio==null) return;

        Deputat d = findDeputatInVerxovnaRada(fio);
        if (d==null){
            System.out.println("нема такого депутата");
            return;
        }
        if (isOutOfFraction(d)) {
            fr.addDeputat(d);
            return;
        }
        System.out.println("депутат не є позафракційним");
    }

    public static void justRemoveDeputatFromFraction(Fraction fr, Deputat dp){
        fr.removeDeputat(dp);
        noNameFraction.addDeputat(dp);
    }

    public void removeDeputatFromFraction(){
        String fractionName = inputFractionName();
        if (fractionName==null) return;
        Fraction fr = isFraction(fractionName);
        if (fr == null) {
            System.out.println("fraction not exist");
            return;
        }

        Fio fio= inputNameAndLastName();
        if (fio==null) return;
        Deputat d=fr.findDeputatInFractionByName(fio);
        if (d==null){
            System.out.println("нема такого депутата в фракції");
            return;
        }

        justRemoveDeputatFromFraction(fr,d);
    }

    public static void addFractionByName(){
        String x = inputFractionName();
        if (x==null) return;
        addFraction(x);
    }

    public static Fraction addFraction(String fr){
        Fraction f1 = new Fraction(fr);
        fractionsList.add(f1);
        return f1;
    }

    public Fraction clearFraction(){
        String x = inputFractionName();
        if (x==null||x.equals(OUTOFFRACTION)) return null;
        Fraction fr = isFraction(x);
        if (fr==null) return null;

        for (Deputat d: fr.getFractionDeputats()) {
            noNameFraction.addDeputat(d);
            fr.justRemoveDeputat(d);
        }
        return fr;
    }

    public void removeFraction(){
        Fraction fr = clearFraction();
        if (fr==null) return;
        fractionsList.remove(fr);
    }

    public static void printVerhovnaRadaAll(){

        for (Fraction fr : fractionsList){
            fr.printAllDeputats();
        }
    }
    public static void printFractionByName(){
        String x = inputFractionName();
        if (x==null) return;
        Fraction fr = isFraction(x);
        if (fr==null) return;
        fr.printAllDeputats();
    }


    public static void printFractions() {

        for (Fraction fr :  fractionsList) {
            System.out.println(fr);
        }
    }
    public static void printAllXabarnykVR() {

        for (Fraction fr :  fractionsList) {
            fr.printAllXabarnyk();
        }
    }


    public static void printBiggestXabarnyk() {
        Deputat dMax = null;
        Deputat x;
        Fraction xx = null;
        for (Fraction fr :  fractionsList) {
            x=fr.findBiggestXabarnyk();
            if (x.getXabarAmount()>dMax.getXabarAmount()) {
                dMax=x;
                xx=fr;
            }

        }
        System.out.println("Найбільший хабарник в Верховній Раді:");
        System.out.println(dMax);
        System.out.println(xx);
    }


}
