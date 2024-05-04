package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "welcome to calculator";
    }

    @Override
    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + "+" + num2 + "=" + result;
    }

    @Override
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + "-" + num2 + "=" + result;

    }

    @Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + "*" + num2 + "=" + result;
    }

    @Override
    public String divide(int num1, int num2) {
        int result = num1 / num2;
        return num1 + "/" + num2 + "=" + result;
    }
}