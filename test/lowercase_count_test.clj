(ns lowercase-count-test
  (:require [clojure.test :refer :all]
            [kata.lowercase-count :refer [lowercase_count]]))

(defn assert-equals [act exp]
  (is (= act exp)))

(deftest better_than_average_test
  (testing "Basic Tests"
    (assert-equals(lowercase_count "abc") 3)
    (assert-equals(lowercase_count "abcABC123") 3)
    ;note that this had to remove an escape character because of clojure's string rules
    (assert-equals(lowercase_count "abcABC123!@#$%^&*()_-+=}{[]|':;?/>.<,~") 3)
    (assert-equals(lowercase_count "") 0)
    ;note that this had to remove an escape character because of clojure's string rules
    (assert-equals(lowercase_count "ABC123!@#$%^&*()_-+=}{[]|':;?/>.<,~") 0)
    (assert-equals(lowercase_count "abcdefghijklmnopqrstuvwxyz") 26)))