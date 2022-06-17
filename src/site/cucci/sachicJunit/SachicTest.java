package site.cucci.sachicJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SachicTest {
    Sachic sachic = new Sachic();

    @Test
    public void add_test() {
        // given (준비) : 어떠한 데이터가 준비되었을 때
        int num1 = 10;
        int num2 = 5;

        // when (실행) : 어떠한 함수를 실행하면
        int result = sachic.add(num1, num2);

        // then (검증) : 어떠한 결과가 나와야 한다.
        assertEquals(15, result);
    }

    @Test
    public void sub_test() {
        // given (준비) : 어떠한 데이터가 준비되었을 때
        int num1 = 10;
        int num2 = 5;

        // when (실행) : 어떠한 함수를 실행하면
        int result = sachic.sub(num1, num2);

        // then (검증) : 어떠한 결과가 나와야 한다.
        assertEquals(5, result);
    }

    @Test
    public void mul_test() {
        // given (준비) : 어떠한 데이터가 준비되었을 때
        int num1 = 10;
        int num2 = 5;

        // when (실행) : 어떠한 함수를 실행하면
        int result = sachic.mul(num1, num2);

        // then (검증) : 어떠한 결과가 나와야 한다.
        assertEquals(50, result);

    }

    @Test
    public void div_test() {
        // given (준비) : 어떠한 데이터가 준비되었을 때
        int num1 = 10;
        int num2 = 5;

        // when (실행) : 어떠한 함수를 실행하면
        int result = sachic.div(num1, num2);

        // then (검증) : 어떠한 결과가 나와야 한다.
        assertEquals(2, result);

    }
}
