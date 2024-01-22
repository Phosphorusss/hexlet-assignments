package exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws IOException {
        String serialize = car.serialize(car);
        FileWriter writer = new FileWriter(String.valueOf(path));
        writer.write(serialize);
        writer.close();
    }

    public static Car extract(Path path) throws IOException {
        String content = Files.readString(path);
        Car car = Car.unserialize(content);
        return car;
    }
}
// END
