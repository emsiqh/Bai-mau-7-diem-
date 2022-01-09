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
public class QLTB implements Serializable {

    private ThietBi tb;
    private PhongHoc ph;
    private int sluong;
    private String ttrang;

    public QLTB() {
    }

    public QLTB(ThietBi tb, PhongHoc ph, int sluong, String ttrang) throws TrongEx {
        if (ttrang.isEmpty()) {
            throw new TrongEx();
        }
        this.tb = tb;
        this.ph = ph;
        this.sluong = sluong;
        this.ttrang = ttrang;
    }

    public ThietBi getTb() {
        return tb;
    }

    public void setTb(ThietBi tb) {
        this.tb = tb;
    }

    public PhongHoc getPh() {
        return ph;
    }

    public void setPh(PhongHoc ph) {
        this.ph = ph;
    }

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public String getTtrang() {
        return ttrang;
    }

    public void setTtrang(String ttrang) {
        this.ttrang = ttrang;
    }

    public Object[] toObjects() {
        return new Object[]{
            ph.getMa(), ph.getTen(), tb.getMa(), tb.getTen(), sluong, ttrang
        };
    }

}
