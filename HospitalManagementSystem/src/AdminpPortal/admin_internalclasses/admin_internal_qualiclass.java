/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminpPortal.admin_internalclasses;

/**
 *
 * @author AbdulRehman
 */
public class admin_internal_qualiclass {
    private int qid,qamount;
    private String qname;

    public admin_internal_qualiclass(int qid, int qamount, String qname) {
        this.qid = qid;
        this.qamount = qamount;
        this.qname = qname;
    }

    public int getQid() {
        return qid;
    }

    public int getQamount() {
        return qamount;
    }

    public String getQname() {
        return qname;
    }
    
    
}
