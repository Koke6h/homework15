package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "welcome to calculator";
    }

    @Override
    public int plus(int num1, int num2) {

        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {

        return num1 - num2;

    }

    @Override
    public int multiply(int num1, int num2) {

        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}