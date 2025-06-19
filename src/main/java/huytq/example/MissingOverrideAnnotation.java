package huytq.example;

import java.util.logging.Logger;


class Animal {
    private static final Logger log = Logger.getLogger( Animal.class.getName() );
    void speak() {
        log.info("Animal speaks");
    }
}

class Dog extends Animal {
    private static final Logger log = Logger.getLogger( Dog.class.getName() );
    @Override
    void speak() {
        log.info("Dog barks");
    }
}
