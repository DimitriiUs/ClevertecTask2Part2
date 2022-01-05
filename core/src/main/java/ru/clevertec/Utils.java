package ru.clevertec;

public class Utils {

    public boolean isAllPositiveNumbers(String... str) {
        StringUtils utils = new StringUtils();

        for (String s : str) {
            if (!utils.isPositiveNumber(s)) {
                return false;
            }
        }

        return true;
    }
}
