package HeadJavaOOP.Inheritance;

import javax.print.Doc;

public class Surgeon extends Doctor {
    @Override
    void treatPatient() {
        super.treatPatient();
        //performes surgery
    }

    void makeIncision(){
        //make incision
    }
}
