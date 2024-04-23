package org.allvechile;

import org.twowheeler.TwoWheeler;
import org.threewheeler.ThreeWheeler;
import org.fourwheeler.FourWheeler;

public class Vechile {
	
public void vehicleNecessery() {
System.out.println("Travel");
}

public static void main(String[]args) {
Vechile v=new Vechile ();
v.vehicleNecessery();

TwoWheeler t= new TwoWheeler();
t.bike();
t.cycle();

ThreeWheeler w= new ThreeWheeler();
w.auto();

FourWheeler f= new FourWheeler();
f.bus();
f.car();
f.lorry();

}

}
