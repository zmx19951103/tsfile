package cn.edu.tsinghua.tsfile.timeseries.filterV2.expression.impl;

import cn.edu.tsinghua.tsfile.timeseries.filterV2.expression.UnaryFilter;
import cn.edu.tsinghua.tsfile.timeseries.filterV2.visitor.NormalFilterVisitor;
import cn.edu.tsinghua.tsfile.timeseries.filterV2.visitor.ValueFilterVisitor;

/**
 * Less than or Equals
 *
 * @param <T> comparable data type
 * @author CGF
 */
public class LtEq<T extends Comparable<T>> extends UnaryFilter<T> {

    private static final long serialVersionUID = -2088181659871608986L;

    public LtEq(T value) {
        super(value);
    }

    @Override
    public <R> R accept(NormalFilterVisitor<R> visitor) {
        return visitor.visit(this);
    }

    @Override
    public <R> R accept(T value, ValueFilterVisitor<R> visitor) {
        return visitor.visit(value, this);
    }

    @Override
    public String toString() {
        return " <= " + value;
    }
}
