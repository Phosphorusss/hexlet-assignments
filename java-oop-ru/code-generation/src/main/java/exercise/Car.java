package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@AllArgsConstructor
@Getter
@ToString
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize(Car car) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonCar = mapper.writeValueAsString(car);
        return jsonCar;
    }

    public static Car unserialize(String jsonCar) throws IOException {
        Car car = new ObjectMapper().readValue(jsonCar, Car.class);
        return car;
    }
    // END
}
