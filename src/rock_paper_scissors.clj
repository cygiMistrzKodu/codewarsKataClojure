(ns rock-paper-scissors)

(defn rps [p1 p2]
  (let [h {"scissors" "rock" "rock" "paper" "paper" "scissors"}]
    (cond
      (= p1 p2) "Draw!"
      (= (get h p1) p2) "Player 2 won!"
      :else "Player 1 won!")))

