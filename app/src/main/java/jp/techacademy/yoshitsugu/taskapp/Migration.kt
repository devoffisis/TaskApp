package jp.techacademy.yoshitsugu.taskapp

import io.realm.DynamicRealm
import io.realm.RealmMigration

class Migration : RealmMigration {

    override  fun migrate(realm: DynamicRealm, oldVersion: Long, newVersion: Long) {
        val realmSchema = realm.schema

        if (oldVersion == 0L) {
            val userSchema = realmSchema.get("Task")
            userSchema!!.addField("category", String::class.java)
        }
    }
}
