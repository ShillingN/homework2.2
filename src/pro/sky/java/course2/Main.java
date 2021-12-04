package pro.sky.java.course2;

public class Main {

    public static void main(String[] args) {
        TransportMeansService transportMeansService = new TransportMeansService();
        ServiceStation serviceStation = new ServiceStation();

//        TransportMeans[] transportMeans = {
//                new TransportMeans("Track", 2),
//                new TransportMeans("Aist", 2),
//                new TransportMeans("Ford", 4),
//                new TransportMeans("Volkswagen", 4),
//                new TransportMeans("Kamaz", 8),
//                new TransportMeans("Maz", 10),
//        };
//
//        for (int i = 0; i < transportMeans.length; i++) {
//            transportMeansService.printTransport(transportMeans[i]);
//        }


        Bicycle[] bicycle = {
                new Bicycle("Track", 2),
                new Bicycle( "Aist", 2),
        };

        Car[] car = {
                new Car("Ford", 4),
                new Car("Volkswagen", 4),
        };

        Truck[] truck = {
                new Truck("Kamaz", 8),
                new Truck("Maz", 10),
        };


//        for (int i = 0; i < bicycle.length; i++) {
//            transportMeansService.printTransport(bicycle[i]);
//            transportMeansService.updateTyre(bicycle[i]);
//        }
//
//        for (int i = 0; i < car.length; i++) {
//            transportMeansService.printTransport(car[i]);
//        }
//
//        for (int i = 0; i < truck.length; i++) {
//            transportMeansService.printTransport(truck[i]);
//        }

//        TransportVehicles[] transportVehicles = {
//                new Bicycle("Track", 2),
//                new Bicycle("Aist", 2),
//                new Car("Ford", 4),
//                new Car("Volkswagen", 4),
//                new Truck("Kamaz", 8),
//                new Truck("Maz", 10),
//        };

        TransportVehicles[] transportVehicles = new TransportVehicles[bicycle.length + car.length + truck.length];
        for (int i = 0; i < bicycle.length; i++) {
            transportVehicles[i] = bicycle[i];
            serviceStation.check(bicycle[i]); // не понимаю как реализовать класс ServiceStation
        }

        for (int i = 0; i < truck.length; i++) {
            transportVehicles[i + bicycle.length + car.length] = truck[i];
            serviceStation.check(truck[i]);
        }

        for (int i = 0; i < car.length; i++) {
            transportVehicles[i + bicycle.length] = car[i];
            serviceStation.check(car[i]);
        }

        for (int i = 0; i < transportVehicles.length; i++) {
            transportMeansService.printTransport(transportVehicles[i]);
        }



    }
}
