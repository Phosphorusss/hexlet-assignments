package exercise;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import java.lang.reflect.AnnotatedElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {

    /*public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Address address = new Address(null, "London", "1-st street", "7", "2");
        System.out.println(validate(address));
    }*/
    public static ArrayList<String> validate(Address address) throws IllegalAccessException {
        Class adderssClass = address.getClass();
        Field [] fields = adderssClass.getDeclaredFields();

        ArrayList arrayFields = new ArrayList<String>();
        for (var field: fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(NotNull.class) && field.get(address) == null) {
                arrayFields.add(field.getName());
            }
        }
        return arrayFields;
    }

    public static Map<String, String> advancedValidate(Address address) throws IllegalAccessException {
        Class adderssClass = address.getClass();

        Map result = new HashMap<String, String>();
        for (Field field : adderssClass.getDeclaredFields()) {
            var annotationParametrs = field.getAnnotation(MinLength.class);
            if (annotationParametrs != null) {
                field.setAccessible(true);
                String getFiled = (String) field.get(address);
                if (getFiled.length() < annotationParametrs.minLength()) {
                    List listErr = new ArrayList<String>();
                    listErr.add("length less than " + annotationParametrs.minLength());
                    result.put(field.getName(), listErr);
                }
            }
        }
        return result;
    }

}
// END