/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminpPortal.admin_detailsclasses;

/**
 *
 * @author AbdulRehman
 */
public class detailingclass {
    class admitdetails{
        int adtdid,optid,rpid ,page , room  , rid , nid , did;
        String pfname , plname , psex ,roomtype , ward ,status , chkin , chkout ;
        public admitdetails(int adtdid,int optid, int rpid, int page, int room, int rid, int nid, int did, String pfname, String plname, String psex, String roomtype, String ward, String status, String chkin, String chkout) {
            this.adtdid = adtdid;
            this.optid = optid;
            this.rpid = rpid;
            this.page = page;
            this.room = room;
            this.rid = rid;
            this.nid = nid;
            this.did = did;
            this.pfname = pfname;
            this.plname = plname;
            this.psex = psex;
            this.roomtype = roomtype;
            this.ward = ward;
            this.status = status;
            this.chkin = chkin;
            this.chkout = chkout;
        }

        public int getAdtdid() {
            return adtdid;
        }

        public int getOptid(){
            return optid;
        }
        public int getRpid() {
            return rpid;
        }

        public int getPage() {
            return page;
        }

        public int getRoom() {
            return room;
        }

        public int getRid() {
            return rid;
        }

        public int getNid() {
            return nid;
        }

        public int getDid() {
            return did;
        }

        public String getPfname() {
            return pfname;
        }

        public String getPlname() {
            return plname;
        }

        public String getPsex() {
            return psex;
        }

        public String getRoomtype() {
            return roomtype;
        }

        public String getWard() {
            return ward;
        }

        public String getStatus() {
            return status;
        }

        public String getChkin() {
            return chkin;
        }

        public String getChkout() {
            return chkout;
        }
        
    }
}
