/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.AppliancesInfo;

/**
 *
 * @author dell
 */
public class POJO_class {
    private String num1;
    private String num2;
    private String combo_bx;
    
    private String rad_btn;
    private String num3;
    private int num4;
    private String num5;

    public POJO_class(String num1, String num2, String combo_bx, String rad_btn, String num3, int num4, String num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.combo_bx = combo_bx;
        this.rad_btn = rad_btn;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    public String getNum1() {
        return num1;
    }

    public String getNum2() {
        return num2;
    }

    public String getCombo_bx() {
        return combo_bx;
    }

    public String getRad_btn() {
        return rad_btn;
    }

    public String getNum3() {
        return num3;
    }

    public int getNum4() {
        return num4;
    }
    
    public String getNum5(){
        return num5;
    }
    
    
    
}
