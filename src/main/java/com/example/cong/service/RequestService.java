package com.example.cong.service;

import com.example.cong.model.Request;

public class RequestService {

    public static Request ketQua(Request request) {
        int tongNut= request.getNutNam()+ request.getNutNu();
        double q=(double) request.getNutNu() / tongNut;;
        double p = (double) request.getNutNam() / tongNut;
        double c = (double) request.getCanhCheo() / request.getTongCanh();
        if (c < 2 * q * p) {
            request.setKetQua("Homophily");
        } else {
            request.setKetQua("Không phải Homophily");
        }
        return request;
    }
}
