/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorPortal;

/**
 *
 * @author AbdulRehman
 */
public class doctorappclass {
    class doctorapp{
        int apid,rpid,did;
        String fname,lname,apdate,status;

        public doctorapp(int apid, int rpid, int did, String fname, String lname, String apdate, String status) {
            this.apid = apid;
            this.rpid = rpid;
            this.did = did;
            this.fname = fname;
            this.lname = lname;
            this.apdate = apdate;
            this.status = status;
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

        public String getFname() {
            return fname;
        }

        public String getLname() {
            return lname;
        }

        public String getApdate() {
            return apdate;
        }

        public String getStatus() {
            return status;
        }

        
    }
}
