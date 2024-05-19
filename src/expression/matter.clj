(ns expression.matter)

(defn multi [a b c]
  (* a b c))

(defn first_multi_rest_add_with_bracket [a b c]
  (* a (+ b c)))

(defn first_add_with_bracket_last_multi [a b c]
  (* c (+ a b)))

(defn two_last_multi_first_add [a b c]
  (+ a (* b c)))

(defn add_all [a b c]
  (+ a b c))


(defn expression-matter [a b c]

  (max (multi a b c) (first_multi_rest_add_with_bracket a b c)
       (two_last_multi_first_add a b c) (first_add_with_bracket_last_multi a b c)
       (add_all a b c))

  )
