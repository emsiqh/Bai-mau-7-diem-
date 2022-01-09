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
public class ThietBi implements Serializable {

    private int ma;
    private String ten, xuatxu;
    private int nam;
    private static int sma = 10000;

    public ThietBi() {
        ma = sma++;
    }

    public ThietBi(int ma, String ten, String xuatxu, int nam) throws TrongEx {
        if (ten.isEmpty()) {
            throw new TrongEx();
        }
        this.ma = ma;
        this.ten = ten;
        this.xuatxu = xuatxu;
        this.nam = nam;
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

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ThietBi.sma = sma;
    }

    public Object[] toObjects() {
        return new Object[]{ma, ten, xuatxu, nam};
    }
}
