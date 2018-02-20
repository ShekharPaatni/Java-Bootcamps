//import org.junit.Assert;
//import org.junit.Ignore;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class AdditionTest {
//    private Addition addition = new Addition();
//    @Test
//    public void canaryTest() {
//        Assert.assertTrue(true);
//    }
//    @Test
//    public void testTheMainMethod() {
//        String[] str = {"12","15"};
//    }
//    @Test
//    public void testTheSumWithTwoints() {
//        int a = 10;
//        int b = 20;
//        Assert.assertEquals(addition.sum(a,b), 30);
//        Assert.assertEquals(addition.sum(a,b), 31);
//    }
//    @Test
//    public void testTheSumWithTwoList() {
//        List list = new ArrayList();
//        list.addAll(Arrays.asList("10","2","30"));
//        List list1 = new ArrayList();
//        list1.addAll(Arrays.asList("15","14"));
//
//        Assert.assertEquals(addition.sum(list,list1),Arrays.asList("10","2","31","15","14"));
//    }
//    @Test
//    @Ignore
//    public void testTheSumWithTwoFloat() {
//        Assert.assertEquals(addition.sum(10.5F, 15F),26.8F, 0.0);
//    }
//    @Test
//    public void testTheSumWithTwoDouble() {
//        Assert.assertEquals(addition.sum(15.9, 15.8), 31.7, 0.1);
//    }
//}
