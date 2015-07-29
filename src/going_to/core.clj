(ns going-to.core)

(defn factorial [n]
  (loop [n n acc 1N]
    (if (or (zero? n) (= 1 n))
      acc
      (recur (dec n) (* acc n)))))

(defn going
  "(1 / n!) * (1! + 2! + 3! + ... + n!)"
  [n]
  (/ (reduce + (map factorial (range 1 (inc n))))
     (factorial n)))
