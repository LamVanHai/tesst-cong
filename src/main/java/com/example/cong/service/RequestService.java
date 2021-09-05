package com.example.cong.service;

import com.example.cong.model.Request;

import java.util.ArrayList;
import java.util.List;

public class RequestService {

    private static List<Request> requests=new ArrayList<>();

    public static List<Request> ketQua(Request request) {
        int tongNut= request.getNutNam()+ request.getNutNu();
        double q=(double) Math.round(((double) request.getNutNu() / tongNut)*1000)/1000;
        double p = (double) Math.round(((double)request.getNutNam() / tongNut)*1000)/1000;
        double c = (double) Math.round(((double)request.getCanhCheo() / request.getTongCanh())*1000)/1000;
        if (c < 2 * q * p) {
            request.setKetQua("Homophily");
        } else {
            request.setKetQua("Không phải Homophily");
        }
        request.setC(c);
        request.setP(p);
        request.setQ(q);
        request.setQp((double) Math.round((double) 2*p*q*1000)/1000);
        requests.add(request);
        return requests;
    }

    public static void main(String[] args) {
        double a=11.125142434;
        System.out.println((double) Math.round(a*100)/100);
        double b=(double) Math.round(a*100)/100;
        System.out.println(b);
    }
}
