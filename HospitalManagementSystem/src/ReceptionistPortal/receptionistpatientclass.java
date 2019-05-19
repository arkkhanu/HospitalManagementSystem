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
public class receptionistpatientclass {
    public class appointmentclass{

        int apid,rpid,did,billamount;
        String pfname,plname,rfname,rlname,dfname,dlname,ddeptward,pphno,status,apdate,regdate;
        
        public appointmentclass(int apid, int rpid, int did, int billamount, String pfname, String plname, String rfname, String rlname, String dfname, String dlname, String ddeptward, String pphno, String status, String apdate, String regdate) {
            this.apid = apid;
            this.rpid = rpid;
            this.did = did;
            this.billamount = billamount;
            this.pfname = pfname;
            this.plname = plname;
            this.rfname = rfname;
            this.rlname = rlname;
            this.dfname = dfname;
            this.dlname = dlname;
            this.ddeptward = ddeptward;
            this.pphno = pphno;
            this.status = status;
            this.apdate = apdate;
            this.regdate = regdate;
        }

        public int getApid() {
            return apid;
        }

        public int getRpid() {
            return rpid;
        }

        public int getDid() {
            return did;
        }

        public int getBillamount() {
            return billamount;
        }

        public String getPfname() {
            return pfname;
        }

        public String getPlname() {
            return plname;
        }

        public String getRfname() {
            return rfname;
        }

        public String getRlname() {
            return rlname;
        }

        public String getDfname() {
            return dfname;
        }

        public String getDlname() {
            return dlname;
        }

        public String getDdeptward() {
            return ddeptward;
        }

        public String getPphno() {
            return pphno;
        }

        public String getStatus() {
            return status;
        }

        public String getApdate() {
            return apdate;
        }

        public String getRegdate() {
            return regdate;
        }
        
        
         

       
    }
}
