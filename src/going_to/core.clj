(ns going-to.core)

(defn factorial [n]
  (if (or (zero? n) (= 1 n))
    1
    (* n (factorial (dec n)))))
