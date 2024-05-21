(ns rock-paper-scissors)

(defn player_2_winner []
  "Player 2 won!"
  )

(defn player_1_winner []
  "Player 1 won!"
  )

(defn draw []
  "Draw!"
  )

(defn rps [p1 p2]

  (if (= p1 p2)
    (draw)
    (if (and (= p1 "scissors") (= p2 "rock"))
      (player_2_winner)
      (if (and (= p1 "paper") (= p2 "scissors"))
        (player_2_winner)
        (if (and (= p1 "rock") (= p2 "paper"))
          (player_2_winner)
          (if (and (= p1 "rock") (= p2 "scissors"))
            (player_1_winner)
            (if (and (= p1 "scissors") (= p2 "paper"))
              (player_1_winner)
              (if (and (= p1 "paper") (= p2 "rock"))
                (player_1_winner)
                )
              )
            )
          )
        )
      )

    )
  )

