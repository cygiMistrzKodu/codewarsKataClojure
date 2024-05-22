(ns kata.lowercase-count)

(defn lowercase_count [strng]

  (def lowercase (re-seq #"[a-z]" strng))
  (count lowercase)
  )