package org.twocentsforthoughts.problems.common;

import java.util.Map;
import java.util.TreeMap;

/**
 * Simple utility that generates the fibonacci sequence;
 * @author Andre
 *
 */
public class FibonnaciCalculator {

    class NumberCache {
        Map<Integer, Long> termCache = new TreeMap<Integer, Long>();

        public long getTermTermValue(int term) {
            return termCache.get(term);
        }

        public boolean isTermCalculated(int term) {
            return termCache.containsKey(term);
        }

        public void putTermValue(int term, long value) {
            termCache.put(term, value);
        }

    }

    NumberCache cache = new NumberCache();

    public long calculateTerm(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            if (!cache.isTermCalculated(n)) {
                long firstValue = calculateTerm(n - 1);
                long secondValue = calculateTerm(n - 2);
                cache.putTermValue(n, firstValue + secondValue);
            }
            return cache.getTermTermValue(n);
        }

    }

}
