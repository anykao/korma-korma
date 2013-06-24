(ns korma-tool.oracle
  (:require [korma.db :refer :all]
            [korma.core :refer :all]
            [clojure.pprint :refer [pprint]]
            [clj-time.format :refer [unparse formatter-local]]
            [clj-time.local :refer [to-local-date-time]]
  (:gen-class)))
(defdb db  (oracle  {
                     :host  "host_ip"
                     :port "1521:ETRARBE"
                     :user  "user"
                     :password  "password"
                     :make-pool? false
                     }))
(defentity tbl
  (table :DUAL)
  )

(defn -main
  [& args]
  (exec-raw  ["SELECT * FROM dual"  []] :results)
  (pprint (first (exec-raw  "desc dual" :results)))
  )
