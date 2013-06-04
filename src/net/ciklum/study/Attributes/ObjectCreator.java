package net.ciklum.study.Attributes;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectCreator {
    private Map<Object, String> values = new HashMap<Object, String>();

    //private User user;
    public ObjectCreator() {
        values.put("username", "Flylex");
        values.put("firstname", "Kateryna");
        values.put("lastname", "Kurnus");
        values.put("birthday", "20.02.1986");
        values.put("age", "27");

        values.put("name", "Butch");
        values.put("fname", "Volodymyr");
        values.put("lname", "Cheremiskin");
        values.put("bday", "27.01.1987");
        values.put("userAge", "26");
    }


    public void addElement(String object, String string) {
        values.put(object, string);
    }

    public String getElement(String object) {
        return values.get(object);
    }

    public Object getFilledClass(Class clazz) throws Exception {
        Field[] fields = clazz.getFields();
        Object myObject = clazz.newInstance();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Property.class)) {
                String anotatedValue = field.getAnnotation(Property.class).value();
                field.setAccessible(true);
                field.set(myObject, values.get(anotatedValue));
            } else {
                field.setAccessible(true);
                field.set(myObject,values.get( field.getName()));
            }

        }
          //Class c = Class.forName(clazz.getName());
          return myObject;
    }

}
