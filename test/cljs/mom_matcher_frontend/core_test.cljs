(ns mom-matcher-frontend.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [mom-matcher-frontend.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
