(ns aoc-2022.day4
  (:require [aoc-2022.core :as a22]
            [clojure.string :as string]
            [clojure.set :as set]))

(def input
  (a22/read-input 6))
;(def sample "mjqjpqmgbljsphdztnvjfqwrcgsmlb")

;(count (distinct (take 4 (rest sample))))

#_(if (= 4 (count (distinct (take 4 "abcd"))))
    (println sample)
    (println "NO"))

(defn marker-loop [in]
  (loop [string in
         cnt 4]
   ; (println cnt)
    (if (= 4 (count (distinct (take 4 string))))
      cnt
      (recur (rest string) (inc cnt)))))

(defn marker-message [in]
  (loop [string in
         cnt 14]
    ;(println cnt)
    (if (= 14 (count (distinct (take 14 string))))
      cnt
      (recur (rest string) (inc cnt)))))

;(marker-message input)

(defn part-one [_]
  (->> input
       (marker-loop)))

(defn part-two [_]
  (->> input
       (marker-message)))

(defn run [_]
  (println "Part 1:" (part-one nil))
  (println "Part 2:" (part-two nil)))
