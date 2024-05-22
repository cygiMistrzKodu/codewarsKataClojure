(ns kata.lowercase-count)

(defn is_lowercase? [letter]
  (Character/isLowerCase letter)
  )

(defn lowercase_count [strng]

  (->> strng (filter is_lowercase?)
       count)
  )