//import gerzen777gmail.com.boxtask.model.Apple;
//import gerzen777gmail.com.boxtask.model.Box;
//import gerzen777gmail.com.boxtask.model.Orange;
//import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
//
//import java.util.Arrays;
//import java.util.Collections;
//
//public class PutTest {
//    @Test
//    public void NewTest() {
//
//        Box<Apple> box1 = new Box<>();
//        Box<Orange> box2 = new Box<>();
//        Box<Apple> box3 = new Box<>();
//
//        box1.putFruit(new Apple(), 3);
//        box2.putFruit(new Orange(), 2);
//        box3.putFruit(new Apple(), 2);
//
//
//        //Я так понял должно быть что-то типа этого: [Apple] [Apple] [Apple].
//        //Пробовал варианты toString и многие другие, но мне всё время выдавались ссылки
//        //на объект или что-то вроде них. Пробовал данную Вами на уроке библиотеку, но она
//        //не упростила задачу, так как я не понимаю как мне избавиться от ссылочного вывода
//
//
////        Assertions.assertEquals("[Apple] [Apple] [Apple]", box1.putFruit(new Apple(), 3));
//    }
//}