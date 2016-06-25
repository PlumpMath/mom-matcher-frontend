(ns mom-matcher-frontend.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [mom-matcher-frontend.core-test]))

(doo-tests 'mom-matcher-frontend.core-test)
