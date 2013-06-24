(ns korma-tool.mysql
  (:require [korma.db :refer :all]
            [korma.core :refer :all]
            [clojure.pprint :refer [pprint]]
            [clj-time.format :refer [unparse formatter-local]]
            [clj-time.local :refer [to-local-date-time]]
  (:gen-class)))
(defdb db (mysql {:host "host_ip"
                  :db "db_name"
                  :user "user"
                  :password "password"
                  :make-pool? false}
                 ))
(comment
  (defentity tbl
    (table "t_holiday"))
  (select tbl)
  (defentity tbl2
    (table "t_users"))

  (select "t_holiday")
  (exec-raw  "desc t_holiday" :results)
  )

