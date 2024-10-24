package racingcar.filter.impl.filterchain;

import racingcar.filter.Filter;

public class CarNameFilterChain extends DefaultFilterChain {
    public CarNameFilterChain() {
        super();
    }

    @Override
    protected void internalDoFilter(String input) {
        if (position < filterListLength) {
            Filter filter = filters.get(position++);
            filter.doFilter(input, this);
        }
    }
}
