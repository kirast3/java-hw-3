public class ATM {
    public int countBanknotes(int sum) {
        int newSum = 0;
        if (sum == 500 || sum == 200 || sum == 100 || sum == 50 || sum == 20 || sum == 10 || sum == 5 || sum == 2 || sum == 1) {
            return newSum += 1;
        } else {
            while (sum > 0) {
                if (sum >= 500) {
                    sum -= 500;
                    newSum += 1;
                    continue;
                } else if (sum >= 200) {
                    sum -= 200;
                    newSum += 1;
                    continue;
                } else if (sum >= 100) {
                    sum -= 100;
                    newSum += 1;
                    continue;
                } else if (sum >= 50) {
                    sum -= 50;
                    newSum += 1;
                    continue;
                } else if (sum >= 20) {
                    sum -= 20;
                    newSum += 1;
                    continue;
                } else if (sum >= 10) {
                    sum -= 10;
                    newSum += 1;
                    continue;
                } else if (sum >= 5) {
                    sum -= 5;
                    newSum += 1;
                    continue;
                } else if (sum >= 2) {
                    sum -= 2;
                    newSum += 1;
                    continue;
                } else {
                    sum = 0;
                    newSum += 1;
                    break;
                }
            }

        }


        return newSum;
    }
}
