(ns noboringzeros.core)


(defn no-boring-zeros [n]

  (Integer/parseInt (re-find #"-?[1-9][0-9]*[1-9]|0?" (str n)))

  )