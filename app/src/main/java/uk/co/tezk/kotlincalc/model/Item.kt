package uk.co.tezk.kotlincalc.model

import io.realm.RealmObject

/**
 * Created by tezk on 03/07/17.
 */

open class Item(
        var description: String = "",
        var price: Int = 0,
        var measure: Int=25,
        var name: String = ""
) : RealmObject()