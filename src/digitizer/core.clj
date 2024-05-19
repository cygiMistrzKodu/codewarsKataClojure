(ns digitizer.core
  (:require [clojure.string :as str]))

(defn digitize [n]
  (vec (map read-string (reverse (str/split (str n) #""))))
  )