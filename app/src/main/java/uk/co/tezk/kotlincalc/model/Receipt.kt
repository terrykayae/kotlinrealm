package uk.co.tezk.kotlincalc.model

import io.realm.RealmList
import io.realm.RealmObject
import java.util.*

/**
 * Created by tezk on 03/07/17.
 */

open class Receipt(
        servedBy : User? = null,
        time : Date? = null,
        total : Int = 0,
        received : Int = 0,
        change : Int = 0,
        discount : Int = 0
) : RealmObject() {
    var orderList : RealmList<Order> = RealmList()
}