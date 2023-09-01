package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        pharmacy.save(new Medication("IBU", 5.93, true));
        pharmacy.save(new Medication("Vitamin C", 6.5, false));

        System.out.println(pharmacy.find("IBU"));

        System.out.println(pharmacy.getCount());

        pharmacy.delete("Vitamin C");

        pharmacy.printAllMedications();
    }
}