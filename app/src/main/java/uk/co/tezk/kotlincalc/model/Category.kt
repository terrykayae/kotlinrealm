package uk.co.tezk.kotlincalc.model

import io.realm.RealmList
import io.realm.RealmObject

/**
 * Created by tezk on 03/07/17.
 */

open class Category(
        var categoryName: String = "",
        var description: String = ""
) : RealmObject() {
    var items : RealmList <Item> = RealmList()
}