package LambdaConcepts;

import java.sql.SQLOutput;

public class DefaultMethod implements Name {



    @Override
    public void shoW() {
        System.out.println("rshow my name every were");
    }

    @Override
    public void hide() {
        System.out.println("hide my name ");
    }

    @Override
    public void hideAndShow() {
        System.out.println("rahul kumar sinha ");
    }

    public static void main(String[] args) {
        DefaultMethod d = new DefaultMethod();
        d.hide();
        d.hideAndShow();
        d.shoW();
    }


}
