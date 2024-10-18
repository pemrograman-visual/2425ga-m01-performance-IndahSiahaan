// 12S24052 - Indah Triyuni Siahaan
// 12S24007 - Dasmauli Sormin

import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double performa, nilai, kredit, a, aB, b, bC, c, d, e;
        String nilaiHuruf, kredit1;

        kredit = 0;
        a = 4.0;
        aB = 3.5;
        b = 3.0;
        bC = 2.5;
        c = 2.0;
        d = 1.0;
        e = 0.0;
        kredit1 = input.nextLine();
        if (kredit1.equals("---")) {
            kredit1 = kredit1;
        } else {
            kredit = Integer.parseDouble(kredit1);
        }
        nilaiHuruf = input.nextLine();
        while (!nilaiHuruf.equals("---")) {
            if (nilaiHuruf.equals("A")) {
                nilai = 4.0;
            } else {
                if (nilaiHuruf.equals("AB")) {
                    nilai = 3.5;
                } else {
                    if (nilaiHuruf.equals("B")) {
                        nilai = 3.0;
                    } else {
                        if (nilaiHuruf.equals("BC")) {
                            nilai = 2.5;
                        } else {
                            if (nilaiHuruf.equals("C")) {
                                nilai = 2.0;
                            } else {
                                if (nilaiHuruf.equals("D")) {
                                    nilai = 1.0;
                                } else {
                                    if (nilaiHuruf.equals("E")) {
                                        nilai = 0.0;
                                    } else {
                                        nilai = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = nilai * kredit;
            System.out.println(toFixed(performa,1));
            kredit1 = input.nextLine();
            if (kredit1.equals("---")) {
                kredit1 = kredit1;
            } else {
                kredit = Integer.parseDouble(kredit1);
            }
            nilaiHuruf = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
