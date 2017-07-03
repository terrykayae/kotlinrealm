package uk.co.tezk.kotlincalc.model

import io.realm.RealmObject

/**
 * Created by tezk on 03/07/17.
 */

open class User(
        var name : String = ""
) : RealmObject()