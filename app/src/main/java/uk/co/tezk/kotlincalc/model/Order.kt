package uk.co.tezk.kotlincalc.model

import io.realm.RealmObject

/**
 * Created by tezk on 03/07/17.
 */
open class Order(
        var item: Item? = null,
        var amount: Int = 0,
        var cost: Int = 0
) : RealmObject() {

}