(ns kata.lowercase-count)

(defn is_lowercase? [letter]
  (Character/isLowerCase letter)
  )

(defn lowercase_count [strng]

  (count (re-seq #"[a-z]" strng))
  )