package reflection.fields;

import reflection.classes.ReflectionClasses;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
        Class reflectionFields = ReflectionFields.class;

        // get public fields
        Field[] fields = reflectionFields.getFields();
        // get private fields
        Field[] fieldsPrivates = reflectionFields.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType());
            System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
        }

    }
}
