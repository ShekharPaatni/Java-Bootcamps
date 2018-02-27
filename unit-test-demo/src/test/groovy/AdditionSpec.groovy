import com.example.Addition
import spock.lang.Specification;

public class AdditionSpec extends Specification {

    def addition;

    void setup(){
        addition = new Addition();
    }

    void "canary test"(){
        println "this is canary test"
        expect:
            true
    }
    void  "sum of two numbers" () {
        expect:
        addition.sum(10, 15) == 25

    }
    void "sum of two String" () {
        expect:
        addition.sum("hello", "world") == "hello world"
    }
    void "sum of the two lists" () {
        List list = new ArrayList(Arrays.asList(10,15,0,16));
        List list1 = new ArrayList(Arrays.asList(20,15,10));
        expect:
        addition.sum(list,list1) == Arrays.asList(10,15,0,16,20,15,10);
    }
    void "sum of the two float" () {
        expect:
        addition.sum(10.9F, 50.2F) == 60.1F
    }
    void "sum of the two double" () {
        expect:
        addition.sum(25.2,16.7) == 41.9
    }
    /*void "maximum of two numbers"() {
        expect:
        // exercise math method for a few different inputs
        Math.max(1, 3) == 3
        Math.max(7, 4) == 7
        Math.max(0, 0) == 0
    }

    void "maximum of two numbers"(int a, int b, int c) {
        expect:
        Math.max(a, b) == c

        where:
        a | b | c
        1 | 3 | 3
        7 | 4 | 7
        0 | 0 | 0
    }

    def "maximum of two numbers, another way"() {
        expect:
        Math.max(a, b) == c

        where:
        a | b || c
        1 | 3 || 3
        7 | 4 || 7
        0 | 0 || 0
    }*/

    /*void "test addition of integer numbers"(){
        setup: "setup details come here"
        given: "an empty block"
    }*/

}
