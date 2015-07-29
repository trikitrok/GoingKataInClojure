(ns going-to.core)

(defn factorial [n]
  (loop [n n acc 1N]
    (if (or (zero? n) (= 1 n))
      acc
      (recur (dec n) (* acc n)))))
