package uk.co.tezk.kotlincalc

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.RealmMigration

/**
 * Created by tezk on 03/07/17.
 */
class MyApp : Application() {

    val  myApp : MyApp by lazy { this }

    override fun onCreate() {
        super.onCreate()

        val config : RealmConfiguration
        config = RealmConfiguration.Builder()
                .schemaVersion(1)
                .migration(RealmMigration { realm, oldVersion, newVersion ->
                        if (newVersion == 2L) {

                        }
                })
                .build()
        Realm.setDefaultConfiguration(config)
        Realm.init(this)
    }
}