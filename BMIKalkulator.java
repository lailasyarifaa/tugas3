package modul3.tugas3;

import java.util.Scanner;

/**
 * Kelas ini menghitung Body Mass Index (BMI) berdasarkan berat badan(kg), dan tinggi badan(m) seseorang.
 */
public class BMIKalkulator {
    /**3
     * Metode ini menghitung BMI berdasarkan berat badan dan tinggi yang diberikan.
     *
     * @param beratBadan Berat badan individu dalam kilogram.
     * @param tinggi Tinggi individu dalam meter.
     * @return Nilai BMI (Body mass Index).
     */
    public double hitungBMI(double beratBadan, double tinggi){
        // Formula untuk menghitung BMI: BMI = berat badan(kg) / (tinggi(m) * tinggi(m))
        return beratBadan / (tinggi * tinggi);
    }

    /**
     * Metode ini memberikan kategori BMI berdasarkan nilai BMI yang diberikan.
     *
     * @param bmi Nilai BMI yang sudah dihitung.
     * @return Kategori BMI (Misalnya: "Kurus", "Normal", "Gemuk", dan "Obesitas").
     */
    public String kategoriBMI(double bmi){
        if (bmi < 18.5){
            return "Kurus";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Gemuk";
        }else {
            return "Obesitas";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Berat Badan(kg): ");
        double beratBadan = input.nextDouble();

        System.out.println("Masukkan tinggi(m): ");
        double tinggi = input.nextDouble();

        BMIKalkulator bmiKalkulator = new BMIKalkulator();
        double bmi = bmiKalkulator.hitungBMI(beratBadan, tinggi);
        String kategori = bmiKalkulator.kategoriBMI(bmi);

        System.out.println("BMI anda: " + bmi);
        System.out.println("Kategori anda: " + kategori);
    }

}
