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
public class admin_internal_classes {
    
    public class roomcatee{ 
        private int rcid,peramount;
        private String rcatename;
        public roomcatee(int rcid, int peramount, String rcatename) {
            this.rcid = rcid;
            this.peramount = peramount;
            this.rcatename = rcatename;
        }
         
        public int getRcid() {
            return rcid;
        }

        public int getPeramount() {
            return peramount;
        }

        public String getRcatename() {
            return rcatename;
        } 
    }
    
    public class qualiclass {
        private int qid,qamount;
        private String qname;

        public qualiclass(int qid, int qamount, String qname) {
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

    public class wardclass{
        private int wid;
        private String wname;

        public int getWid() {
            return wid;
        }

        public String getWname() {
            return wname;
        }

        public wardclass(int wid, String wname) {
            this.wid = wid;
            this.wname = wname;
        }
        
    }
    
    public class rooms{
        
        private int rid,rcid,wid,nid;
        private String rname,wname,nfname,nlname,status;
        
        public rooms(int rid, int rcid, int wid, int nid, String rname, String wname, String nfname, String nlname, String status) {
            this.rid = rid;
            this.rcid = rcid;
            this.wid = wid;
            this.nid = nid;
            this.rname = rname;
            this.wname = wname;
            this.nfname = nfname;
            this.nlname = nlname;
            this.status = status;
        }
        
        public int getRid() {
            return rid;
        }

        public int getRcid() {
            return rcid;
        }

        public int getWid() {
            return wid;
        }

        public int getNid() {
            return nid;
        }

        public String getRname() {
            return rname;
        }

        public String getWname() {
            return wname;
        }

        public String getNfname() {
            return nfname;
        }

        public String getNlname() {
            return nlname;
        }

        public String getStatus() {
            return status;
        }
    }
}
