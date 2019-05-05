/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReceptionistPortal;

/**
 *
 * @author AbdulRehman
 */
public class receptionist_optdetailjavaclass {
    private int optid,pno,ae;
    private String p_f_name , p_l_name ,gender , doctorname;

    public receptionist_optdetailjavaclass(int optid, int pno, int ae, String p_f_name, String p_l_name, String gender, String doctorname) {
        this.optid = optid;
        this.pno = pno;
        this.ae = ae;
        this.p_f_name = p_f_name;
        this.p_l_name = p_l_name;
        this.gender = gender;
        this.doctorname = doctorname;
    }

    public int getOptid() {
        return optid;
    }

    public int getPno() {
        return pno;
    }

    public int getAe() {
        return ae;
    }

    public String getP_f_name() {
        return p_f_name;
    }

    public String getP_l_name() {
        return p_l_name;
    }

    public String getGender() {
        return gender;
    }

    public String getDoctorname() {
        return doctorname;
    }
    
}
