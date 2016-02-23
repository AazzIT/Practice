package practice003.longestStabilityPeriod;

public class LongestStabilityPeriod {
    public int count(int[] gdp) {
        final int lengthOfPeriod = gdp.length;

        int firstValue;
        int secondValue = 0;

        int maxPeriod = 1;
        int countOfTwoValue;
        int countLastValue;
        //System.out.println(lengthOfPeriod);
        if (lengthOfPeriod < 1) {
            return 0;
        } else if (lengthOfPeriod == 1) {
            return maxPeriod;
        } else {
            maxPeriod = 1;
            countOfTwoValue = 1;
            countLastValue = 1;
            firstValue = gdp[0];
        }

        //System.out.println(countOfTwoValue + " " + countLastValue + " " + firstValue + " " + secondValue);
        for (int i = 1; i < lengthOfPeriod; i++) {
            if (gdp[i] == firstValue) {
                countOfTwoValue++;
            } else if (gdp[i] == secondValue) {
                countOfTwoValue++;
                countLastValue++;
            } else if ((Math.abs(gdp[i] - firstValue) == 1) && (secondValue == 0)) {
                countOfTwoValue++;
                countLastValue = 1;
                secondValue = gdp[i];
            } else if ((Math.abs(gdp[i] - firstValue) >= 1) && (Math.abs(gdp[i] - secondValue) == 1)) {
                countOfTwoValue = countLastValue + 1;
                countLastValue = 1;
                firstValue = secondValue;
                secondValue = gdp[i];
            } else if ((Math.abs(gdp[i] - secondValue) > 1)) {
                countOfTwoValue = 1;
                countLastValue = 1;
                firstValue = gdp[i];
                secondValue = 0;
            }

            if (countOfTwoValue > maxPeriod) maxPeriod = countOfTwoValue;
        }
        return maxPeriod;
    }
}
