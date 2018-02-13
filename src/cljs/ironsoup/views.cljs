(ns ironsoup.views
  (:require [re-frame.core :as re-frame]
            [ironsoup.subs :as subs]
            ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div "Hello from " @name]))
