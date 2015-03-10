(ns euler-clojure.core)

(defn euler1
  "Euler problem 1"
  [& args]
  (reduce + (filter (fn [n] (or
                             (= (mod n 3) 0)
                             (= (mod n 5) 0)))
                    (range 1N 1000N))))

(defn- euler2-fibonacci [n]
  (if (< n 2)
    n
    (* n (euler2-fibonacci (- n 1)))))

(defn euler2
  "Euler problem 2"
  []
  (reduce + (take-while #(< % 4000000) (map euler2-fibonacci (iterate #(+ % 2) 0)))))

(defn count-to [n]
  (loop [i 0]
    (when (< i n)
      (println i)
      (recur (+ i 1)))))

;; (def primes
;;   (repeatedly next-prime))

;; (let primes '(2)
;;      (defn next-prime
;;        )
;;   )
