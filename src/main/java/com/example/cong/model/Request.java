package com.example.cong.model;



import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Data
public class Request {

    @Min(value = 1,message = "phải lớn hơn 0")
    private int nutNam;

    @Min(value = 1,message = "phải lớn hơn 0")
    private int nutNu;

    @Min(value = 1,message = "phải lớn hơn 0")
    private int tongCanh;
    @Min(value = 0,message = "phải lớn hơn hoặc = 0")
    private int canhCheo;

    private int tongNut;

    private String ketQua;


}
