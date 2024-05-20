(ns Slope)

(defn subtract_x_coordinate [v] (- (get v 2) (get v 0)))
(defn subtract_y_coordinate [v] (- (get v 3) (get v 1)))

(defn slope [v]

  (if (= (subtract_x_coordinate v) 0)
    "undefined"
    (str (/ (subtract_y_coordinate v) (subtract_x_coordinate v)))
    )
  )


;; m = ( y2 - y1) / (x2 -x1)  tak sie liczy slope jak jest dzielone przez 0 to jest undefine
;; np. ( 80 - 20 ) / (20 - 10 )