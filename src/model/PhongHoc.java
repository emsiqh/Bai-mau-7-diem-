/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongEx;
import java.io.Serializable;

/**
 *
 * @author HuyTran
 */
public class PhongHoc implements Serializable {

    private int ma;
    private String ten;
    private int soGhe;
    private static int sma = 10000;

    public PhongHoc() {
        ma = sma++;
    }

    public PhongHoc(int ma, String ten, int soGhe) throws TrongEx {
        if (ten.isEmpty()) {
            throw new TrongEx();
        }
        this.ma = ma;
        this.ten = ten;
        this.soGhe = soGhe;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PhongHoc.sma = sma;
    }

    public Object[] toObjects() {
        return new Object[]{
            ma, ten, soGhe};
    }

}
