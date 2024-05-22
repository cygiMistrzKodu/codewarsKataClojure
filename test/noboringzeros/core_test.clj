(ns noboringzeros.core-test
  (:require [clojure.test :refer :all]
            [noboringzeros.core :refer :all]))

(defn testZeros [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "noboringzeros"
    (testZeros  (no-boring-zeros 1450) 145)
    (testZeros  (no-boring-zeros 960000) 96)
    (testZeros  (no-boring-zeros 1050) 105)
    (testZeros  (no-boring-zeros -960000) -96)
    ))

(deftest a-test2
  (testing "noboringzeros"
    ;(testZeros  (no-boring-zeros 68079000) 68079)
    (testZeros  (no-boring-zeros 161309000) 161309)
    (testZeros  (no-boring-zeros 190104000) 190104)
    (testZeros  (no-boring-zeros 190658000) 190658)
    (testZeros  (no-boring-zeros 0) 0)
    ))
