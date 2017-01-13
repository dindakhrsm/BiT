package com.fissilmi.acer.bit.model;

/**
 * Created by ACER on 05/01/2017.
 */

public class Soal {
    private String soal_id;
    private String soal;
    private String pil_a;
    private String pil_b;
    private String pil_c;
    private String url_audio;
    private int jwban;
    private int suara;

    public Soal() {
        super();
    }

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }

    public String getPil_a() {
        return pil_a;
    }

    public void setPil_a(String pil_a) {
        this.pil_a = pil_a;
    }

    public String getPil_b() {
        return pil_b;
    }

    public void setPil_b(String pil_b) {
        this.pil_b = pil_b;
    }

    public String getPil_c() {
        return pil_c;
    }

    public void setPil_c(String pil_c) {
        this.pil_c = pil_c;
    }

    public int getJwban() {
        return jwban;
    }

    public void setJwban(int jwban) {
        this.jwban = jwban;
    }

    public int getSuara() {
        return suara;
    }

    public void setSuara(int suara) {
        this.suara = suara;
    }

    public String getUrl_audio() {
        return url_audio;
    }

    public void setUrl_audio(String url_audio) {
        this.url_audio = url_audio;
    }

    public String getSoal_id() {
        return soal_id;
    }

    public void setSoal_id(String soal_id) {
        this.soal_id = soal_id;
    }

}