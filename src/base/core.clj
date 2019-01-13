(ns base.core
  (:gen-class)
  (:require [clojure.tools.namespace.repl :refer [refresh]])
  (:require [clojure.java.jdbc :as j])
  (:require [org.httpkit.server :refer [run-server]]))

(def db {
         :class-name "mysql-connector-java-8.0.13"
         :subprotocol "mysql"
         :subname "//localhost:3306/epoch"
         :user "backend"
         :password "@@22WWww"
         })

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (str ["Good Job!"])})

(defn -main [& args]
  (run-server app {:port 80})
  (println "Server started on port 80"))

;;(j/insert-multi! db :user
;;                [{:username "bob" :password "builder" :email "muhemail"}])
;;(println (j/query db ["select * from user"] {:row-fn :password}))
;;Does it change tho?
(def card-table-ddl
  (j/create-table-ddl :cards
                      [
                       [:id :int "PRIMARY KEY" "AUTO_INCREMENT"]
                       [:name "varchar(32)"]
                          [:cost :int]
                          [:str :int]
                          [:move :int]
                          [:reach :int]
                          [:def :int]
                          [:life :int]]))

(defn addCard [name cost str move reach def life]
  ;;(j/db-do-commands db [card-table-ddl] )
  (j/insert! db :cards {:name name
                       :cost cost
                       :str str
                       :move move
                       :reach reach
                       :def def
                       :life life}))

  (def context "you have the correct context")

