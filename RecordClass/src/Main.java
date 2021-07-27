public class Main {

    public static void main(String [] args){


        var blankAddress = new Address();
        var fullAddress = new Address("Gran Via", "28013","Albacete","Spain");
        var fullAddress2 = new Address("Gran Via", "28013","Albacete","Spain");

        System.out.println("fullAddres is equals fulladdress2 ?: " + fullAddress.equals(fullAddress2));

        System.out.println("fullAddress: " + fullAddress);
        fullAddress.printStreet();
        System.out.println("blankAddress: " + blankAddress);


    }

}
