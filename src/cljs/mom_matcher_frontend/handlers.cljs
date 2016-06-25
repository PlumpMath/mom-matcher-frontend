(ns mom-matcher-frontend.handlers
    (:require [re-frame.core :as re-frame]
              [mom-matcher-frontend.db :as db]))

(re-frame/register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))
