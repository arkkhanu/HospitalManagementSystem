/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminpPortal;

/**
 *
 * @author AbdulRehman
 */
public class admin_addingclass {
    class adddoctorclass{
        
        int did,age,sal;
        String dfname,dlname,dob,sex,address,phno,city,regdate,username,pass,qualification,deptward;
        
        public adddoctorclass(int did, int age, int sal, String dfname, String dlname, String dob, String sex, String address, String phno, String city, String regdate, String username, String pass, String qualification, String deptward) {
            this.did = did;
            this.age = age;
            this.sal = sal;
            this.dfname = dfname;
            this.dlname = dlname;
            this.dob = dob;
            this.sex = sex;
            this.address = address;
            this.phno = phno;
            this.city = city;
            this.regdate = regdate;
            this.username = username;
            this.pass = pass;
            this.qualification = qualification;
            this.deptward = deptward;
        }

        public int getDid() {
            return did;
        }

        public int getAge() {
            return age;
        }

        public int getSal() {
            return sal;
        }

        public String getDfname() {
            return dfname;
        }

        public String getDlname() {
            return dlname;
        }

        public String getDob() {
            return dob;
        }

        public String getSex() {
            return sex;
        }

        public String getAddress() {
            return address;
        }

        public String getPhno() {
            return phno;
        }

        public String getCity() {
            return city;
        }

        public String getRegdate() {
            return regdate;
        }

        public String getUsername() {
            return username;
        }

        public String getPass() {
            return pass;
        }

        public String getQualification() {
            return qualification;
        }

        public String getDeptward() {
            return deptward;
        }
        
    }
    class addnurseclass{
        int nid,age,sal;
        String nfname,nlname,dob,sex,address,phno,city,regdate,qualification;

        public addnurseclass(int nid, int age, int sal, String nfname, String nlname, String dob, String sex, String address, String phno, String city, String regdate, String qualification) {
            this.nid = nid;
            this.age = age;
            this.sal = sal;
            this.nfname = nfname;
            this.nlname = nlname;
            this.dob = dob;
            this.sex = sex;
            this.address = address;
            this.phno = phno;
            this.city = city;
            this.regdate = regdate;
            this.qualification = qualification;
        }

        public int getNid() {
            return nid;
        }

        public int getAge() {
            return age;
        }

        public int getSal() {
            return sal;
        }

        public String getNfname() {
            return nfname;
        }

        public String getNlname() {
            return nlname;
        }

        public String getDob() {
            return dob;
        }

        public String getSex() {
            return sex;
        }

        public String getAddress() {
            return address;
        }

        public String getPhno() {
            return phno;
        }

        public String getCity() {
            return city;
        }

        public String getRegdate() {
            return regdate;
        }

        public String getQualification() {
            return qualification;
        }
    }
    class addreceptclass{
        int rid,age,sal;
        String rfname,rlname,dob,sex,address,phno,city,regdate,username,pass,qualification;

        public addreceptclass(int rid, int age, int sal, String rfname, String rlname, String dob, String sex, String address, String phno, String city, String regdate, String username, String pass, String qualification) {
            this.rid = rid;
            this.age = age;
            this.sal = sal;
            this.rfname = rfname;
            this.rlname = rlname;
            this.dob = dob;
            this.sex = sex;
            this.address = address;
            this.phno = phno;
            this.city = city;
            this.regdate = regdate;
            this.username = username;
            this.pass = pass;
            this.qualification = qualification;
        }
        public int getRid() {
            return rid;
        }

        public int getAge() {
            return age;
        }

        public int getSal() {
            return sal;
        }

        public String getRfname() {
            return rfname;
        }

        public String getRlname() {
            return rlname;
        }

        public String getDob() {
            return dob;
        }

        public String getSex() {
            return sex;
        }

        public String getAddress() {
            return address;
        }

        public String getPhno() {
            return phno;
        }

        public String getCity() {
            return city;
        }

        public String getRegdate() {
            return regdate;
        }

        public String getUsername() {
            return username;
        }

        public String getPass() {
            return pass;
        }

        public String getQualification() {
            return qualification;
        }

        
    }
}
