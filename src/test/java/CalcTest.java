import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import javafx.util.Pair;

public class CalcTest {
    private Main calc;
    private static final double dx = 1e-15;

    @Before
    public void setUp(){
        calc = new Main();
    }

    @Test
    public void addition_pos(){
        double a = 1;
        double b = 2;
        double gt = 3;
        Assert.assertEquals(gt, calc.myAdd(a, b), dx);
    }

    @Test
    public void addition_neg(){
        double a = 1;
        double b = 2;
        double gt = 0;
        Assert.assertNotEquals(gt, calc.myAdd(a, b), dx);
    }

    @Test
    public void sub_pos(){
        double a = 1;
        double b = 2;
        double gt = -1;
        Assert.assertEquals(gt, calc.mySubs(a, b), dx);
    }

    @Test
    public void sub_neg(){
        double a = 1;
        double b = 2;
        double gt = 0;
        Assert.assertNotEquals(gt, calc.mySubs(a, b), dx);
    }

    @Test
    public void mul_pos(){
        double a = 1;
        double b = 2;
        double gt = 2;
        Assert.assertEquals(gt, calc.myMult(a, b), dx);
    }

    @Test
    public void mul_neg(){
        double a = 1;
        double b = 2;
        double gt = 0;
        Assert.assertNotEquals(gt, calc.myMult(a, b), dx);
    }

    @Test
    public void div_pos(){
        double a = 1;
        double b = 2;
        double gt = 0.5;
        Pair<Boolean, Double> ans = calc.myDivi(a, b);
        Assert.assertEquals(gt, ans.getValue(), dx);
    }

    @Test
    public void div_neg(){
        double a = 1;
        double b = 2;
        double gt = 1;
        Pair<Boolean, Double> ans = calc.myDivi(a, b);
        Assert.assertNotEquals(gt, ans.getValue(), dx);
    }

    @Test
    public void div_by_zero(){
        double a = 1;
        double b = 0;
        boolean gt = false;
        Pair<Boolean, Double> ans = calc.myDivi(a, b);
        Assert.assertEquals(gt, ans.getKey());
    }
}