package org.vehicle;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    Engine dieselEngine = new Engine("Solar", 3500);
    Transmision manualTransmision = new Transmision("Manual", 6);
    Tire trailTire = new Tire("Trail", 309, 70, 20);
    Wheel truckWheel = new Wheel(8, 18);

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testVehicleIsAbstractClass() {
        //reflection
        Class<Vehicle> clazz = Vehicle.class;
        assertTrue(Modifier.isInterface(clazz.getModifiers()));
    }

    @Test
    public void testMotorVehicleIsAbstractClass() {
        //reflection
        Class<MotorVehicle> clazz = MotorVehicle.class;
        assertTrue(Modifier.isAbstract(clazz.getModifiers()));
    }

    @Test
    public void testWagonIsAbstractClass() {
        //reflection
        Class<Wagon> clazz = Wagon.class;
        assertTrue(Modifier.isAbstract(clazz.getModifiers()));
    }

    @Test
    public void testTruckIsVehicle() {
        Truck truckHino = new Truck(dieselEngine, manualTransmision, trailTire, truckWheel, 4500);
        truckHino.setVehicleName("HINO DUTRO CARGO 110 SD");

        assertEquals(true, truckHino instanceof Vehicle);
    }

    @Test
    public void testBusIsVehicle() {
        Bus bisEka = new Bus();
        bisEka.setVehicleName("Bis EKA");

        assertEquals(true, bisEka instanceof Vehicle);
    }

    @Test
    public void testCarIsVehicle() {
        Car car = new Car();
        car.setVehicleName("Mobil Terios");

        assertEquals(true, car instanceof Vehicle);
    }

    @Test
    public void testMotorVehicleIsVehicle() {
        MotorVehicle motorVehicle = new MotorVehicle() {
            @Override
            public void brake() {

            }

            @Override
            public void turnRight() {

            }

            @Override
            public void turnLeft() {

            }

            @Override
            public void forward() {

            }

            @Override
            public void backward() {

            }
        };
        motorVehicle.setVehicleName("Mobil Terios");

        assertEquals(true, motorVehicle instanceof Vehicle);
    }

    @Test
    public void testWagonIsVehicle() {
        Wagon wagon = new Wagon() {
            @Override
            public void brake() {

            }

            @Override
            public void turnRight() {

            }

            @Override
            public void turnLeft() {

            }

            @Override
            public void forward() {

            }

            @Override
            public void backward() {

            }
        };
        wagon.setPullers("Burung Onta");

        assertEquals(true, wagon instanceof Vehicle);
    }

    @Test
    public void testTruckHasBuild() {
        Truck truckHino = new Truck(dieselEngine, manualTransmision, trailTire, truckWheel, 4500);
        truckHino.setVehicleName("HINO DUTRO CARGO 110 SD");

        assertEquals(true, truckHino.getEngine() == dieselEngine);
        assertEquals(true, truckHino.getTransmition() == manualTransmision);
        assertEquals(true, truckHino.getTire() == trailTire);
        assertEquals(true, truckHino.getWheel() == truckWheel);
    }

}
