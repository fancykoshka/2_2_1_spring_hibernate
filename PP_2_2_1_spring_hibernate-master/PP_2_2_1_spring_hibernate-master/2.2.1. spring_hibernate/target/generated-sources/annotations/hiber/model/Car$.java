package hiber.model;

import com.speedment.jpastreamer.field.ComparableField;
import com.speedment.jpastreamer.field.IntField;
import com.speedment.jpastreamer.field.ReferenceField;
import com.speedment.jpastreamer.field.StringField;

/**
 * The generated base for entity {@link Car} representing entities of the {@code
 * car}-table in the database.
 * <p> This file has been automatically generated by JPAStreamer.
 * 
 * @author JPAStreamer
 */
public final class Car$ {
    
    /**
     * This Field corresponds to the {@link Car} field "model".
     */
    public static final StringField<Car> model = StringField.create(
        Car.class,
        "model",
        Car::getModel,
        false
    );
    /**
     * This Field corresponds to the {@link Car} field "series".
     */
    public static final IntField<Car> series = IntField.create(
        Car.class,
        "series",
        Car::getSeries,
        false
    );
    /**
     * This Field corresponds to the {@link Car} field "id".
     */
    public static final ComparableField<Car, Long> id = ComparableField.create(
        Car.class,
        "id",
        Car::getId,
        false
    );
    /**
     * This Field corresponds to the {@link Car} field "user".
     */
    public static final ReferenceField<Car, User> user = ReferenceField.create(
        Car.class,
        "user",
        Car::getUser,
        false
    );
}