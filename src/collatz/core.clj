(ns collatz.core)

(defn collatz-operation
  "If n is even, halve it.
  If n is odd, triple it and add 1."
  [n]
  (if (even? n)
    (/ n 2)
    (+ 1 (* 3 n))))

(defn collatz-number
  "Returns steps in Collatz sequence for n"
  [n]
  (loop [num n
         acc 0]
    (if (= 1 num)
      acc
      (recur (collatz-operation num) (inc acc)))))

(def first-1000
  (for [i (range 1000)]))
