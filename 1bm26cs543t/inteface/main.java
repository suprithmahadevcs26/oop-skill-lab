interface ParkingCharge {
double calculateCharge();
}

abstract class VehicleParking implements ParkingCharge {
String vehicleNumber;
String vehicleType;
int parkingHours;

VehicleParking(String number, String type, int hours) {
vehicleNumber = number;
vehicleType = type;
parkingHours = hours;
}

void display() {
System.out.println("Vehicle Number: " + vehicleNumber);
System.out.println("Vehicle Type: " + vehicleType);
System.out.println("Parking Hours: " + parkingHours);
System.out.println("Parking Charge: Rs. " + calculateCharge());
System.out.println();
}
}

class TwoWheeler extends VehicleParking {
TwoWheeler(String number, int hours) {
super(number, "Two Wheeler", hours);
}

public double calculateCharge() {
if (parkingHours <= 2)
return parkingHours * 20;
else
return 2 * 20 + (parkingHours - 2) * 10;
}
}

class FourWheeler extends VehicleParking {
FourWheeler(String number, int hours) {
super(number, "Four Wheeler", hours);
}

public double calculateCharge() {
if (parkingHours <= 2)
return parkingHours * 50;
else
return 2 * 50 + (parkingHours - 2) * 30;
}
}

class main {
public static void main(String[] args) {
ParkingCharge p;
VehicleParking v1 = new TwoWheeler("KA01AB1234", 4);
VehicleParking v2 = new FourWheeler("KA02CD5678", 3);

p = v1;
v1.display();

p = v2;
v2.display();
}
}