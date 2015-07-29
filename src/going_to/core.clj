(ns going-to.core)

(defn- factorial-helper [n acc]
  (if (or (zero? n) (= 1 n))
    acc
    (recur (dec n) (* acc n))))

(def memoized-factorial-helper (memoize factorial-helper))

(defn factorial [n]
  (memoized-factorial-helper n 1N))

(defn going
  "(1 / n!) * (1! + 2! + 3! + ... + n!)"
  [n]
  (/ (reduce + (map factorial (range 1 (inc n))))
     (* 1.0 (factorial n))))