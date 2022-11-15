package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        sortLotto(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public void sortLotto(List<Integer> numbers) {
        Collections.sort(numbers);
    }
    @Override
    public String toString() {
        return numbers.toString();
    }

    public int countWinningHit(Lotto winningNumbers) {
        return (int) this.numbers.stream()
                .filter(winningNumbers::isHitted)
                .count();
    }

    public boolean isHitted(int num) {
        return numbers.contains(num);
    }
}
