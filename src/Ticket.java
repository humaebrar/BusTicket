public class Ticket {
    public double distance;
    public int typeNo;
    public double price;
    public int seatNo;

    public void printTicket (Bus bus){
        System.out.println("Total Price : " + price);
        System.out.println("---- Ticket Details ----");
        System.out.println("Bus Plate : " + bus.numberPlate);
        System.out.println("Distance : " + distance);
        System.out.println("Type of trip : " + (typeNo==1 ? "One Direction" : "Round Trip"));
        System.out.println("Seat Number : " + seatNo);
        System.out.println("Have a Nice Trip...");
    }
}
