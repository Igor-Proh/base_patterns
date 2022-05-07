package com.prokhnov.patterns.pattern_2_prototype.example.ex_2;

public class Main_ex_2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // создание кеша для хранения обекта
        Cache cache = new Cache();
        // помещение объекта в кеш
        cache.setMyObject(new MyObject());

        // достаём клоны объектов
        MyObject myObject1 = cache.getMyObject();
        MyObject myObject2 = cache.getMyObject();
        MyObject myObject3 = cache.getMyObject();

        // проверяем hashCode() объектов которые мы достали
        System.out.println("MyObject1.hashCode() -> " + myObject1.hashCode());
        System.out.println("MyObject2.hashCode() -> " + myObject2.hashCode());
        System.out.println("MyObject3.hashCode() -> " + myObject3.hashCode());
    }
}

// создание класса с имплементацией интерфейса Cloneable и переопределение метода clone() под наш объект
class MyObject implements Cloneable {
    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        return (MyObject) super.clone();
    }
}

// создание класса Cache для хранения клонируемого объекта
class Cache{
    private MyObject myObject;

    // из метода get() вытягиваем клон объекта который будет засетан
    public MyObject getMyObject() throws CloneNotSupportedException {
        return myObject.clone();
    }

    public void setMyObject(MyObject myObject) {
        this.myObject = myObject;
    }
}
